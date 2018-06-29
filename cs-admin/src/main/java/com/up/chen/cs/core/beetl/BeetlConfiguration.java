package com.up.chen.cs.core.beetl;

import com.up.chen.cs.core.util.KaptchaUtil;
import com.up.chen.cs.core.util.ToolUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

/**
* @Description: beetl拓展配置,绑定一些工具类,方便在模板中直接调用
* @author chenchen
* @date 2018/6/27 10:49
*/
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
    }
}
