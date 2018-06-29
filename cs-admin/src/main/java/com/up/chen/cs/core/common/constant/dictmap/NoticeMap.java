package com.up.chen.cs.core.common.constant.dictmap;


import com.up.chen.cs.core.common.constant.dictmap.base.AbstractDictMap;

/**
* @Description: 通知的映射
* @author chenchen
* @date 2018/6/27 10:58
*/
public class NoticeMap extends AbstractDictMap {

    @Override
    public void init() {
        put("title", "标题");
        put("content", "内容");
    }

    @Override
    protected void initBeWrapped() {
    }
}
