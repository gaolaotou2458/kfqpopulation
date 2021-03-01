package com.zhibodata.gis.kfqpopulation.utils;

import cn.hutool.core.util.StrUtil;
import org.springframework.util.ReflectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TkSearchUtils {

    /**
     * 把实体有属性的值拼接成and 查询类.
     * @param criteria criteria
     * @param t DtO class来恶性
     * @param obj DTO对象
     * @return 匹配参数拼接成and criteria
     */

    public static Example.Criteria getAndCri(Example.Criteria criteria, Class<?> t, Object obj){

        Class<?> clazz = (Class<?>) t;
        Field[] tableFields = clazz.getDeclaredFields();
        for (int i = 0; i < tableFields.length; i++) {
            PropertyDescriptor pd = null;
            try {
                pd = new PropertyDescriptor(tableFields[i].getName(), clazz);
            } catch (java.beans.IntrospectionException e) {
                e.printStackTrace();
            }
            Method getMethod = pd.getReadMethod();//获得get方法
            Object fieldValue = ReflectionUtils.invokeMethod(getMethod, obj);
            if(StrUtil.isBlank(fieldValue+"")){
                continue;
            }
            criteria.andEqualTo(tableFields[i].getName() ,fieldValue.toString());

        }
        return criteria;
    }


    /**
     * 把实体有属性的值拼接成and 查询类.
     * @param criteria criteria
     * @param t DtO class来恶性
     * @param obj DTO对象
     * @return 匹配参数拼接成and criteria
     */
    public static Example.Criteria getAndCri(Example.Criteria criteria, Object obj){

        Class<?> clazz = obj.getClass();
        Field[] tableFields = clazz.getDeclaredFields();
        for (int i = 0; i < tableFields.length; i++) {
            PropertyDescriptor pd = null;
            try {
                pd = new PropertyDescriptor(tableFields[i].getName(), clazz);
            } catch (java.beans.IntrospectionException e) {
                e.printStackTrace();
            }
            Method getMethod = pd.getReadMethod();//获得get方法
            Object fieldValue = ReflectionUtils.invokeMethod(getMethod, obj);
            if(StrUtil.isBlank(fieldValue+"")){
                continue;
            }
            criteria.andEqualTo(tableFields[i].getName() ,fieldValue.toString());
        }
        return criteria;
    }

    /**
     * 把实体有属性的值拼接成like 查询类.
     * @param criteria criteria
     * @param t DtO class来恶性
     * @param obj DTO对象
     * @return 匹配参数拼接成and criteria
     */
    public static Example.Criteria getAndLike(Example.Criteria criteria, Object obj){

        Class<?> clazz = obj.getClass();
        Field[] tableFields = clazz.getDeclaredFields();
        for (int i = 0; i < tableFields.length; i++) {
            PropertyDescriptor pd = null;
            try {
                pd = new PropertyDescriptor(tableFields[i].getName(), clazz);
            } catch (java.beans.IntrospectionException e) {
                e.printStackTrace();
            }
            Method getMethod = pd.getReadMethod();//获得get方法
            Object fieldValue = ReflectionUtils.invokeMethod(getMethod, obj);
            if(StrUtil.isBlank(fieldValue+"")){
                continue;
            }
            criteria.andLike(tableFields[i].getName() ,"%" + fieldValue.toString() + "%");
        }
        return criteria;
    }

//    public  void test1(T t,Object obj) throws java.beans.IntrospectionException {
//        UserInDto user = new UserInDto();
//        user.setUserDescribe("aaaa");
//        user.setUserName("测试");
//
//        Class<?> clazz = UserInDto.class;
//        Field[] tableFields = clazz.getDeclaredFields();
//        Class<?> superClazz = clazz.getSuperclass();
//        if (superClazz.equals(Object.class)) {
//            System.out.println("没有父类");
//        } else {
//            Field[] tableSuperFields = superClazz.getDeclaredFields();
//            Field[] superFields = new Field[tableFields.length + tableSuperFields.length];
//            System.arraycopy(tableFields, 0, superFields, 0, tableFields.length);
//            System.arraycopy(tableSuperFields, 0, superFields, tableFields.length, tableSuperFields.length);
//            Field[] allFields = getSuperClassFields(superFields, superClazz);
//            for (int i = 0; i < allFields.length; i++) {
//                PropertyDescriptor pd = new PropertyDescriptor(allFields[i].getName(), clazz);
//                Method getMethod = pd.getReadMethod();//获得get方法
//                Object fieldValue = ReflectionUtils.invokeMethod(getMethod, user);
//                if(fieldValue == null){
//                    continue;
//                }
//
//                System.out.println(allFields[i].getName() + "的值：" +  fieldValue.toString());
//            }
//        }
//    }

//
//    public  void test2(Class<?> t, Object obj) throws java.beans.IntrospectionException {
//
//
//        Class<?> clazz = (Class<?>) t;
//        Field[] tableFields = clazz.getDeclaredFields();
//        Class<?> superClazz = clazz.getSuperclass();
////        if (superClazz.equals(Object.class)) {
////            System.out.println("没有父类");
////        } else {
////            Field[] tableSuperFields = superClazz.getDeclaredFields();
//        Field[] superFields = new Field[tableFields.length];
//        System.arraycopy(tableFields, 0, superFields, 0, tableFields.length);
//        Field[] allFields = getSuperClassFields(superFields, superClazz);
//        for (int i = 0; i < allFields.length; i++) {
//            PropertyDescriptor pd = new PropertyDescriptor(allFields[i].getName(), clazz);
//            Method getMethod = pd.getReadMethod();//获得get方法
//            Object fieldValue = ReflectionUtils.invokeMethod(getMethod, obj);
//            if(fieldValue == null){
//                continue;
//            }
//
//            System.out.println(allFields[i].getName() + "的值：" +  fieldValue.toString());
//        }
////        }
//    }
//
//    public static void main(String[] args) throws IntrospectionException, java.beans.IntrospectionException {
//        UserInDto user = new UserInDto();
//        user.setUserDescribe("aaaa");
//        user.setUserName("测试");
//        new TkSearchUtils<UserInDto>().test2(UserInDto.class,user);
//    }

    private static Field[] getSuperClassFields(Field[] tableFields, Class<?> clazz) {
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
