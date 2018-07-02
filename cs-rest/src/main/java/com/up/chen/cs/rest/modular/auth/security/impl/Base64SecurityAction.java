package com.up.chen.cs.rest.modular.auth.security.impl;

import com.up.chen.cs.rest.modular.auth.security.DataSecurityAction;
import org.springframework.util.Base64Utils;

/**
* @Title:
* @Description: 对数据进行base64编码的方式
* @author chenchen
* @date 2018/7/2 20:20
*/
public class Base64SecurityAction implements DataSecurityAction {

    @Override
    public String doAction(String beProtected) {
        return Base64Utils.encodeToString(beProtected.getBytes());
    }

    @Override
    public String unlock(String securityCode) {
        byte[] bytes = Base64Utils.decodeFromString(securityCode);
        return new String(bytes);
    }
}
