package com.up.chen.cs.rest.modular.auth.validator.impl;

import com.up.chen.cs.rest.modular.auth.validator.IReqValidator;
import com.up.chen.cs.rest.modular.auth.validator.dto.Credence;
import org.springframework.stereotype.Service;

/**
* @Description: 直接验证账号密码是不是admin
* @author chenchen
* @date 2018/7/2 20:24
*/
@Service
public class SimpleValidator implements IReqValidator {

    private static String USER_NAME = "admin";

    private static String PASSWORD = "admin";

    @Override
    public boolean validate(Credence credence) {

        String userName = credence.getCredenceName();
        String password = credence.getCredenceCode();

        if (USER_NAME.equals(userName) && PASSWORD.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
