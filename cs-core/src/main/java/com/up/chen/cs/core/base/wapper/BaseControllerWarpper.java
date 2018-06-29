package com.up.chen.cs.core.base.wapper;

import com.up.chen.cs.core.base.controller.BaseController;

import java.util.List;
import java.util.Map;

/**
 * @Description: 查询结果的包装类基类
 * @author chenchen
 * @date 2018/6/26 15:02
 */
public abstract class BaseControllerWarpper {

    private Object obj = null;

    public BaseControllerWarpper(Object obj) {
        this.obj = obj;
    }

    public Object warp() {
        if(this.obj instanceof List) {
            List<Map<String, Object>> list = (List<Map<String, Object>>) this.obj;
            for (Map<String, Object> map : list) {
                warpTheMap(map);
            }
            return list;
        } else if (this.obj instanceof Map) {
            Map<String, Object> map = (Map<String, Object>) this.obj;
            warpTheMap(map);
            return map;
        } else {
            return this.obj;
        }
    }

    protected abstract void warpTheMap(Map<String, Object> map);
}
