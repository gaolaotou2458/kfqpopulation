package com.zhibodata.gis.kfqpopulation.common;



import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import com.zhibodata.gis.kfqpopulation.dto.indto.user.LoginInfoOutDto;
import com.zhibodata.gis.kfqpopulation.mapper.SearchLogMapper;
import com.zhibodata.gis.kfqpopulation.mapper.UserMapper;
import com.zhibodata.gis.kfqpopulation.model.SearchLog;
import com.zhibodata.gis.kfqpopulation.model.User;
import com.zhibodata.gis.kfqpopulation.utils.TimeUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import tk.mybatis.mapper.entity.Example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description：切面类，用于记录操作
 * author：lzyCug
 * date: 2020/4/5 22:34
 */
@Component
@Aspect
public class LogAspect {
    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    private SearchLogMapper searchLogMapper;

    private Class aClass; // 访问的类

    private Method method; // 访问的方法

    @Autowired
    private UserMapper userMapper;

    @Around("execution(* com.zhibodata.gis.kfqpopulation.controller.*.*(..))")
    public Object adminControllerBeforeValidation(ProceedingJoinPoint joinPoint) throws Throwable {
        Object resultObject = joinPoint.proceed();
        User user = checkUser(joinPoint);
        // 用户名密码错误剔除
        if (user == null) {
            CommonError commonError = new CommonError(EmBusinessError.ADMIN_SHOULD_LOGIN);
            return CommonRes.create(commonError,"fail");
        }else if ("anonymous".equals(user.getUserName())){
           return joinPoint.proceed();
        }

        // 拿到执行的方法
        method = ((MethodSignature)joinPoint.getSignature()).getMethod();
        //拿 @InsertAnnotation注解
        InsertAnnotation insertAnnotation = method.getAnnotation(InsertAnnotation.class);
        if(insertAnnotation == null){
            //公共方法
            return resultObject;
        }
        Object[] obj = joinPoint.getArgs();
        Object indto =obj[0];
        Method getPin = ReflectionUtils.findMethod(indto.getClass(), "getPin");
        Object pinValue = ReflectionUtils.invokeMethod(getPin, indto);
        //不传递pin 直接放行
        if (StringUtils.isBlank(pinValue + "") || pinValue == null){
            return resultObject;
        }
        //获取RequestAttributes
        String ip = httpServletRequest.getRemoteAddr();
        // 获取访问的类
        aClass = joinPoint.getTarget().getClass();
        //获取入参
        Object[] args = joinPoint.getArgs();
        //插入操作日志数据
        SearchLog searchLog = new SearchLog();
        searchLog.setId(IdUtil.randomUUID());
        searchLog.setMethod(method.toString());
        searchLog.setClazz(aClass.toString());
        searchLog.setSearcher(user.getUserName());
        searchLog.setSearchTime(TimeUtils.getDate());
        searchLog.setSearchIp(ip);
        String orgs = JSONUtil.toJsonStr(args);
        searchLog.setArgs(orgs);
        searchLogMapper.insert(searchLog);

        return joinPoint.proceed();

    }

    private User checkUser(ProceedingJoinPoint  joinPoint) {
        String token = httpServletRequest.getHeader("token");
        // 匿名用户校验
        if ("anonymous".equals(token)) {
            User user = new User();
            user.setUserName("anonymous");
            return user;
        }
        //这里拦截非有效用户
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("token", token);
        User userObj = userMapper.selectOneByExample(example);
        if(userObj != null) {
            return userObj;
        }
        return null;
    }


}
