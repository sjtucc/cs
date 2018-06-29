package com.up.chen.cs.modular.system.warpper;

import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.common.constant.factory.ConstantFactory;

import java.util.Map;

/**
* @Description: 部门列表的包装
* @author chenchen
* @date 2018/6/27 12:00
*/
public class NoticeWrapper extends BaseControllerWarpper {

    public NoticeWrapper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        Integer creater = (Integer) map.get("creater");
        map.put("createrName", ConstantFactory.me().getUserNameById(creater));
    }

}
