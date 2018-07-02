package com.up.chen.cs.rest.modular.auth.controller;

import com.up.chen.cs.core.exception.CsException;
import com.up.chen.cs.rest.common.exception.BizExceptionEnum;
import com.up.chen.cs.rest.modular.auth.controller.dto.AuthRequest;
import com.up.chen.cs.rest.modular.auth.controller.dto.AuthResponse;
import com.up.chen.cs.rest.modular.auth.util.JwtTokenUtil;
import com.up.chen.cs.rest.modular.auth.validator.IReqValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @Description: 请求验证的
* @author chenchen
* @date 2018/7/2 20:14
*/
@RestController
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Resource(name = "simpleValidator")
    private IReqValidator reqValidator;

    @RequestMapping(value = "${jwt.auth-path}")
    public ResponseEntity<?> createAuthenticationToken(AuthRequest authRequest) {

        boolean validate = reqValidator.validate(authRequest);

        if (validate) {
            final String randomKey = jwtTokenUtil.getRandomKey();
            final String token = jwtTokenUtil.generateToken(authRequest.getUserName(), randomKey);
            return ResponseEntity.ok(new AuthResponse(token, randomKey));
        } else {
            throw new CsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
        }
    }

    @RequestMapping("index")
    public ResponseEntity<?> index() {
        String a = "a";
        return ResponseEntity.ok("a");

    }

}
