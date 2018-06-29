package com.up.chen.cs.core.shiro.check;

/**
 * 检查用接口
 */
public interface ICheck {

    /**
     * 检查当前登录用户是否拥有指定的角色访问当
     */
    boolean check(Object[] permissions);

    /**
     * 检查当前登录用户是否拥有当前请求的servlet的权限
     */
    boolean checkAll();
}
