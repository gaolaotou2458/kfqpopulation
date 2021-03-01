package com.zhibodata.gis.kfqpopulation.common;

import com.alibaba.fastjson.JSON;
import lombok.var;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *@description: 缓存主键生成类
 *@author: 徐小康
 *@time: 2020/12/14 16:04
 */

@Component
public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
//        这里获取不到父类params的参数
//        return method.getName()+"::"+ Arrays.toString(params);
        return method.getName()+"::"+ JSON.toJSONString(params);
    }
}
