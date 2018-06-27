package com.up.chen.cs.core.exception;

/**
* @Description: 抽象接口
* @author chenchen
* @date 2018/6/26 16:31
*/
public interface ServiceExceptionEnum {

    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();
}
