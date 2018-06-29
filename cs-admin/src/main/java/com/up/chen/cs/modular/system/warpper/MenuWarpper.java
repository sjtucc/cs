package com.up.chen.cs.modular.system.warpper;

import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.common.constant.factory.ConstantFactory;
import com.up.chen.cs.core.constant.IsMenu;

import java.util.List;
import java.util.Map;

/**
* @Description: 菜单列表的包装类
* @author chenchen
* @date 2018/6/27 12:00
*/
public class MenuWarpper extends BaseControllerWarpper {

    public MenuWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("statusName", ConstantFactory.me().getMenuStatusName((Integer) map.get("status")));
        map.put("isMenuName", IsMenu.valueOf((Integer) map.get("ismenu")));
    }

}
