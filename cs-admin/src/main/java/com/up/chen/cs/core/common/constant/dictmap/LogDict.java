package com.up.chen.cs.core.common.constant.dictmap;


import com.up.chen.cs.core.common.constant.dictmap.base.AbstractDictMap;

/**
* @Description: 日志的字典
* @author chenchen
* @date 2018/6/27 10:57
*/
public class LogDict extends AbstractDictMap {

    @Override
    public void init() {
        put("tips","备注");
    }

    @Override
    protected void initBeWrapped() {

    }
}
