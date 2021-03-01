package com.zhibodata.gis.kfqpopulation.utils;

import java.lang.reflect.Method;
import java.util.Date;

public class DefaultAttrUtils {



    /**
     * 自动设置实体类的  创建者，更新者，创建时间，更新时间
     * @param clazz
     * @param obj
     * @return
     */
    public static void setCreateAndUpdate(Class<?> clazz,Object obj){
        //单点登录用户
        String currentUser = LoginContentUtil.getLoginUserInfo();
        try {

            Method setCreateUser = clazz.getMethod("setCreateUser",String.class);
            Method setCreateTime = clazz.getMethod("setCreateTime", Date.class);
            Method setUpdateUser = clazz.getMethod("setUpdateUser",String.class);
            Method setUpdateTime = clazz.getMethod("setUpdateTime", Date.class);

            setCreateUser.invoke(obj,currentUser);
            setUpdateUser.invoke(obj,currentUser);
            setCreateTime.invoke(obj,TimeUtils.getDate());
            setUpdateTime.invoke(obj,TimeUtils.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setUpdate(Class<?> clazz,Object obj){
        //单点登录用户
        String currentUser = LoginContentUtil.getLoginUserInfo();
        try {
            Method setUpdateUser = clazz.getMethod("setUpdateUser",String.class);
            Method setUpdateTime = clazz.getMethod("setUpdateTime", Date.class);
            setUpdateUser.invoke(obj,currentUser);
            setUpdateTime.invoke(obj,TimeUtils.getDate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
