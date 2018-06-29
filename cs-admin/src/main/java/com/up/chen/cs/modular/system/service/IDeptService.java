package com.up.chen.cs.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.up.chen.cs.core.node.ZTreeNode;
import com.up.chen.cs.modular.system.model.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Description:  部门服务
* @author chenchen
* @date 2018/6/27 11:52
*/
public interface IDeptService extends IService<Dept> {

    /**
     * 删除部门
     */
    void deleteDept(Integer deptId);

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    List<Map<String, Object>> list(@Param("condition") String condition);
}
