package com.up.chen.cs.core.support.test;

import com.up.chen.cs.core.support.BeanKit;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import java.beans.IntrospectionException;

/**
 * @Description:
 * @author chenchen
 * @date 2018/6/27 9:01
 */
public class BeanKit_Test {

    @Test
    public void isBean() {
        BeanKit.isBean(BeanKit_Test.class);
    }

    @Test
    public void findEditor() {
        System.out.println(BeanKit.isBean(BeanKit_Test.class));
    }

    @Test
    public void getPropertyDescriptors() throws IntrospectionException {
        System.out.println(BeanKit.getPropertyDescriptors(BeanKit_Test.class));
    }

    @Test
    public void getPropertyDescriptor() throws IntrospectionException {
        System.out.println(BeanKit.getPropertyDescriptor(BeanKit_Test.class, "isBean"));
    }

}
