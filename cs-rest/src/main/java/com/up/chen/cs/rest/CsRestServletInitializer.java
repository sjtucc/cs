package com.up.chen.cs.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
* @Title: Cs REST Web程序启动类
* @Description:
* @author chenchen
* @date 2018/7/2 19:58
*/
public class CsRestServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CsRestApplication.class);
    }

}
