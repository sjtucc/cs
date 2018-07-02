package com.up.chen.cs.rest.modular.auth.security;

/**
* @Description: 数据加密方案
* @author chenchen
* @date 2018/7/2 20:19
*/
public interface DataSecurityAction {

    /**
     * 执行数据的保护措施
     *
     * @author stylefeng
     * @Date 2017/9/18 20:42
     */
    String doAction(String beProtected);

    /**
     * 解除保护
     *
     * @author stylefeng
     * @Date 2017/9/18 20:45
     */
    String unlock(String securityCode);
}
