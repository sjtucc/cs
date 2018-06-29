package com.up.chen.cs.core.common.constant.dictmap;

import com.up.chen.cs.core.common.constant.dictmap.base.AbstractDictMap;

/**
* @Description: 字典map
* @author chenchen
* @date 2018/6/27 10:57
*/
public class DictMap extends AbstractDictMap {

    @Override
    public void init() {
        put("dictId","字典名称");
        put("dictName","字典名称");
        put("dictValues","字典内容");
    }

    @Override
    protected void initBeWrapped() {

    }
}
