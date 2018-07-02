package com.up.chen.cs.rest.modular.auth.validator;


import com.up.chen.cs.rest.modular.auth.validator.dto.Credence;

public interface IReqValidator {

    /**
     * 通过请求参数验证
     *
     * @author fengshuonan
     * @Date 2017/8/23 11:49
     */
    boolean validate(Credence credence);
}
