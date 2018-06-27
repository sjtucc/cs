package com.up.chen.cs.core.mutidatasource.annotation;

import java.lang.annotation.*;

/**
 * @Description: 多数据源标识
 * @author chenchen
 * @date 2018/6/26 16:44
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DataSource {

    String name() default "";

}
