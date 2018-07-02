package com.up.chen.cs.rest.modular.auth.converter;

/**
* @Description: 基础的传输bean
* @author chenchen
* @date 2018/7/2 20:17
*/
public class BaseTransferEntity {

    private String object; //base64编码的json字符串

    private String sign;   //签名

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
