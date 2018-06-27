package com.up.chen.cs.core.exception;

/**
 * @Description: 封装CS的异常
 * @author chenchen
 * @date 2018/6/26 16:37
 */
public class CsException extends RuntimeException {
    private Integer code;

    private String message;

    public CsException(ServiceExceptionEnum serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
