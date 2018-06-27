package com.up.chen.cs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
* @Description: Web程序启动类
* @author chenchen
* @date 2018/6/26 14:02
*/
public class CsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CsApplication.class);
    }
}