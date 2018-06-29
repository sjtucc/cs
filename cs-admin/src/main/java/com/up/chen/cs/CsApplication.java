package com.up.chen.cs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @Description: springboot启动类
* @author chenchen
* @date 2018/6/26 14:02
*/
@SpringBootApplication
public class CsApplication {
    private final static Logger logger = LoggerFactory.getLogger(CsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CsApplication.class, args);
        logger.debug("CsApplication is success!");
    }
}
