package com.up.chen.cs.modular.system.warpper;

import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.common.constant.factory.ConstantFactory;

import java.util.List;
import java.util.Map;

/**
* @Description: 用户管理的包装类
* @author chenchen
* @date 2018/6/27 12:01
*/
public class UserWarpper extends BaseControllerWarpper {

    public UserWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("sexName", ConstantFactory.me().getSexName((Integer) map.get("sex")));
        map.put("roleName", ConstantFactory.me().getRoleName((String) map.get("roleid")));
        map.put("deptName", ConstantFactory.me().getDeptName((Integer) map.get("deptid")));
        map.put("statusName", ConstantFactory.me().getStatusName((Integer) map.get("status")));
    }

}
