package com.zhibodata.gis.kfqpopulation.utils;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;

import java.util.Date;

public  class TimeUtils {
    public final static byte[] aes_key = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static void main(String[] args) {
        String content = "test中文";
        // 随机生成密钥
        byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();
        System.out.println(key);
        // 构建
        AES aes = SecureUtil.aes(key);
        // 加密为16进制表示
        String encryptHex = aes.encryptHex(content);
        // 解密为字符串
        String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
        System.out.println(decryptStr);

    }

    /**
     * yyyy-MM-dd HH:mm:ss 格式date.
     * @return
     */
    public static Date getDate(){
        String now = DateUtil.now();
        Date date = DateUtil.parse(now);
        return date;
    }


}
