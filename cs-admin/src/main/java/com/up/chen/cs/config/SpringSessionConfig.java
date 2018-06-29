package com.up.chen.cs.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

/**
* @Description: spring session配置
* @author chenchen
* @date 2018/6/27 10:15
*/
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)  //session过期时间  如果部署多机环境,需要打开注释
@ConditionalOnProperty(prefix = "cs", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
