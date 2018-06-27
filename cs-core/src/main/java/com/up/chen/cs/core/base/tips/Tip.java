package com.up.chen.cs.core.base.tips;

/**
* @Description: 返回给前台的提示
* @author chenchen
* @date 2018/6/26 14:59
*/
public abstract class Tip {

    protected int code;
    protected String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}