package com.up.chen.cs.core.common.constant.dictmap;


import com.up.chen.cs.core.common.constant.dictmap.base.AbstractDictMap;

/**
* @Description: 部门的映射
* @author chenchen
* @date 2018/6/27 10:56
*/
public class DeptDict extends AbstractDictMap {

    @Override
    public void init() {
        put("deptId", "部门名称");
        put("num", "部门排序");
        put("pid", "上级名称");
        put("simplename", "部门简称");
        put("fullname", "部门全称");
        put("tips", "备注");
    }

    @Override
    protected void initBeWrapped() {
        putFieldWrapperMethodName("deptId", "getDeptName");
        putFieldWrapperMethodName("pid", "getDeptName");
    }
}
