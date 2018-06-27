package com.up.chen.cs.core.base.tips;

/**
* @Description:  返回给前台的错误提示
* @author chenchen
* @date 2018/6/26 15:00
*/
public class ErrorTip extends Tip {
    public ErrorTip(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
}