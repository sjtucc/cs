package com.up.chen.cs.core.common.constant.dictmap.factory;


import com.up.chen.cs.core.common.constant.factory.ConstantFactory;
import com.up.chen.cs.core.common.constant.factory.IConstantFactory;
import com.up.chen.cs.core.common.exception.BizExceptionEnum;
import com.up.chen.cs.core.exception.CsException;

import java.lang.reflect.Method;

/**
* @Description: 字典字段的包装器(从ConstantFactory中获取包装值)
* @author chenchen
* @date 2018/6/27 11:10
*/
public class DictFieldWarpperFactory {

    public static Object createFieldWarpper(Object parameter, String methodName) {
        IConstantFactory constantFactory = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, parameter.getClass());
            return method.invoke(constantFactory, parameter);
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
                return method.invoke(constantFactory, Integer.parseInt(parameter.toString()));
            } catch (Exception e1) {
                throw new CsException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
            }
        }
    }

}
