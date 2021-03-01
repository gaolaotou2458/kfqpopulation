package com.zhibodata.gis.kfqpopulation.common;


import com.zhibodata.gis.kfqpopulation.dto.indto.resource.FeatureEntity;
import com.zhibodata.gis.kfqpopulation.dto.indto.resource.Features;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage;
import com.zhibodata.gis.kfqpopulation.dto.outdto.RPage2;
import com.zhibodata.gis.kfqpopulation.mapper.UserMapper;
import com.zhibodata.gis.kfqpopulation.model.User;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Aspect
@Configuration
public class ControllerAspect {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Autowired
    private UserMapper userMapper;

    //切com.zhibodata.gis.kfqpopulation.controller 下所有方法且该方法被打上RequestMapping 标签
    @Around("execution(* com.zhibodata.gis.kfqpopulation.controller.*.*(..)) && (@annotation(org.springframework.web.bind.annotation.RequestMapping) ||  @annotation(org.springframework.web.bind.annotation.PostMapping))")
    public Object adminControllerBeforeValidation(ProceedingJoinPoint joinPoint) throws Throwable {
        // 拿到执行的方法
        Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
        //拿 @AdminPermission注解
         AdminPermission adminPermission = method.getAnnotation(AdminPermission.class);
        if(adminPermission == null){
            //公共方法
            Object resultObject = joinPoint.proceed();
            return resultObject;
        }
        Object[] obj = joinPoint.getArgs();
        Object indto =obj[0];
        // 这个obj[0] 是Controller入参
        Method getPin = ReflectionUtils.findMethod(indto.getClass(), "getPin");
        Object pinValue = ReflectionUtils.invokeMethod(getPin, indto);
        //不传递pin 或者pin为空时进行数据脱敏加***号
        if (StringUtils.isBlank(pinValue + "") || pinValue == null){
            Object resultObject = joinPoint.proceed();
            CommonRes returnDate = (CommonRes)resultObject;
            Object controllerData = returnDate.getData();
            //数据脱敏处理
            getSafeData(controllerData);
            return resultObject;
        }
        //传递了pin码进行PIN码校验后返回原始数据 不带****号
        boolean isPin = checkPin(indto);
        if(!isPin) {
            CommonError commonError= new CommonError(EmBusinessError.PIN_ERROR);
            return CommonRes.create(commonError,"fail");
        }
        // 放行
        Object resultObject = joinPoint.proceed();
        return resultObject;

    }


    /**
     * 处理数据增加脱敏.
     * @param controllerData
     * @return
     */
    private void getSafeData(Object controllerData){

        if(controllerData instanceof  List){
            ((ArrayList) controllerData).stream().forEach(item ->{
                getSaveDataByOne(item);
            });
        } else if(controllerData instanceof Map){

            List dataList = (List) ((Map) controllerData).get("dataList");
            dataList.stream().forEach(item ->{
                getSaveDataByOne(item);
            });
        }  else if( controllerData instanceof RPage){
            List dataList = ((RPage) controllerData).getDataList();
            dataList.stream().forEach(item ->{
                getSaveDataByOne(item);
            });
        }else if( controllerData instanceof RPage2){
            Object dataList = ((RPage2) controllerData).getDataList();
            if (dataList instanceof  FeatureEntity){
                FeatureEntity featureEntity = (FeatureEntity) dataList;
                featureEntity.getFeatures().forEach( feature -> {
                    getSaveDataByOne(feature.getProperties());
                });
            }
        }else if(controllerData instanceof FeatureEntity){
            FeatureEntity featureEntity = (FeatureEntity) controllerData;
            featureEntity.getFeatures().forEach( feature -> {
                getSaveDataByOne(feature.getProperties());
            });
        } else {
            //单个实体
            getSaveDataByOne(controllerData);
        }
    }

    /**
     * 单实体脱敏.
     * @param item
     */
    private void getSaveDataByOne(Object item){
        Method getTmSfzh = ReflectionUtils.findMethod(item.getClass(), "getSfzh");
        if (getTmSfzh !=null){
            Object sfzh = ReflectionUtils.invokeMethod(getTmSfzh, item);
            if(sfzh != null) {
                sfzh = sfzh.toString().substring(0,6)+"****"+sfzh.toString().substring(10);
            }
            Method setTmSfzh = ReflectionUtils.findMethod(item.getClass(), "setSfzh",String.class);
            ReflectionUtils.invokeMethod(setTmSfzh, item,sfzh);
        }
        Method getTmDhhm = ReflectionUtils.findMethod(item.getClass(), "getDhhm");
        if (getTmDhhm != null){
            Object dhhm = ReflectionUtils.invokeMethod(getTmDhhm, item);
            if(dhhm != null) {
                dhhm = dhhm.toString().substring(0,5)+"****"+dhhm.toString().substring(9);
            }
            Method setTmDhhm = ReflectionUtils.findMethod(item.getClass(), "setDhhm",String.class);
            ReflectionUtils.invokeMethod(setTmDhhm, item,dhhm);
        }
    }

    /**
     * 校验pin码是否正确
     * @param inDto
     * @return
     * @throws IntrospectionException
     */
    private boolean checkPin(Object inDto) throws IntrospectionException, BusinessException {

        Class clazz = inDto.getClass();
        Field[] tableFields = clazz.getDeclaredFields();
        Class<?> superClazz = clazz.getSuperclass();
        String userName = "";
        String pin = "";
        if (superClazz.equals(Object.class)) {
            throw new BusinessException(EmBusinessError.NO_PARENT_PIN_ERROR);

        } else {
            Field[] tableSuperFields = superClazz.getDeclaredFields();
            Field[] superFields = new Field[tableFields.length + tableSuperFields.length];
            System.arraycopy(tableFields, 0, superFields, 0, tableFields.length);
            System.arraycopy(tableSuperFields, 0, superFields, tableFields.length, tableSuperFields.length);
            Field[] allFields = getSuperClassFields(superFields, superClazz);
            for (int i = 0; i < allFields.length; i++) {
                PropertyDescriptor pd = new PropertyDescriptor(allFields[i].getName(), clazz);
                Method getMethod = pd.getReadMethod();//获得get方法
                Object fieldValue = ReflectionUtils.invokeMethod(getMethod, inDto);
                if (fieldValue == null) {
                    continue;
                }
                if (StringUtils.equals(allFields[i].getName(), "userName")) {
                    userName = fieldValue.toString();
                }
                if (StringUtils.equals(allFields[i].getName(), "pin")) {
                    pin = fieldValue.toString();
                }
                System.out.println(allFields[i].getName() + "的值：" + fieldValue.toString());
            }
            //根据 userName 和 pin进行校验
            User user = new User();
            user.setUserName(userName);
            user.setPin(pin);
            List<User> userList = userMapper.select(user);
            if(userList.size() == 0){
                return false;
            }
        }
        return true;
    }

    private  Field[] getSuperClassFields(Field[] tableFields, Class<?> clazz) {
        Class<?> superClazz = clazz.getSuperclass();
        if (superClazz.equals(Object.class)) {
            return tableFields;
        }
        Field[] tableSuperFields = superClazz.getDeclaredFields();

        Field[] c = new Field[tableFields.length + tableSuperFields.length];
        System.arraycopy(tableFields, 0, c, 0, tableFields.length);
        System.arraycopy(tableSuperFields, 0, c, tableFields.length, tableSuperFields.length);
        getSuperClassFields(c, superClazz);
        return c;
    }
}
