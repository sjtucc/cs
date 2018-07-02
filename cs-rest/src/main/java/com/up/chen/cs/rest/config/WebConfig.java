package com.up.chen.cs.rest.config;

import com.up.chen.cs.rest.config.properties.RestProperties;
import com.up.chen.cs.rest.modular.auth.filter.AuthFilter;
import com.up.chen.cs.rest.modular.auth.security.DataSecurityAction;
import com.up.chen.cs.rest.modular.auth.security.impl.Base64SecurityAction;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* @Description: web配置
* @author chenchen
* @date 2018/7/2 20:08
*/
@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(prefix = RestProperties.REST_PREFIX, name = "auth-open", havingValue = "true", matchIfMissing = true)
    public AuthFilter jwtAuthenticationTokenFilter() {
        return new AuthFilter();
    }

    @Bean
    public DataSecurityAction dataSecurityAction() {
        return new Base64SecurityAction();
    }
}
