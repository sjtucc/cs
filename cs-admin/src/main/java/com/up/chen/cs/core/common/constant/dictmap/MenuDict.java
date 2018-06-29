package com.up.chen.cs.core.common.constant.dictmap;

import com.up.chen.cs.core.common.constant.dictmap.base.AbstractDictMap;

/**
* @Description: 菜单的字典
* @author chenchen
* @date 2018/6/27 10:58
*/
public class MenuDict extends AbstractDictMap {

    @Override
    public void init() {
        put("menuId","菜单id");
        put("id","菜单id");
        put("code","菜单编号");
        put("pcode","菜单父编号");
        put("name","菜单名称");
        put("icon","菜单图标");
        put("url","url地址");
        put("num","菜单排序号");
        put("levels","菜单层级");
        put("tips","备注");
        put("status","菜单状态");
        put("isopen","是否打开");
        put("","");
    }

    @Override
    protected void initBeWrapped() {

    }
}
