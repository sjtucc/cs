package com.up.chen.cs.modular.system.warpper;


import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.common.constant.factory.ConstantFactory;

import java.util.List;
import java.util.Map;
/**
* @Description: 角色列表的包装类
* @author chenchen
* @date 2018/6/27 12:00
*/
public class RoleWarpper extends BaseControllerWarpper {

    public RoleWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("pName", ConstantFactory.me().getSingleRoleName((Integer) map.get("pid")));
        map.put("deptName", ConstantFactory.me().getDeptName((Integer) map.get("deptid")));
    }

}
