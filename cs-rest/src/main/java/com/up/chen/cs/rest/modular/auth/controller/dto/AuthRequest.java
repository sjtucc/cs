package com.up.chen.cs.rest.modular.auth.controller.dto;

import com.up.chen.cs.rest.modular.auth.validator.dto.Credence;

/**
* @Description: 认证的请求dto
* @author chenchen
* @date 2018/7/2 20:15
*/
public class AuthRequest implements Credence {

    private String userName;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String getCredenceName() {
        return this.userName;
    }

    @Override
    public String getCredenceCode() {
        return this.password;
    }
}
