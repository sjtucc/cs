package com.up.chen.cs.core.util;


import com.up.chen.cs.config.properties.CsProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(CsProperties.class).getKaptchaOpen();
    }
}