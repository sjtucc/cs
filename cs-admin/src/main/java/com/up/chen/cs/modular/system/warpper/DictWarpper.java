package com.up.chen.cs.modular.system.warpper;

import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.common.constant.factory.ConstantFactory;
import com.up.chen.cs.core.util.ToolUtil;
import com.up.chen.cs.modular.system.model.Dict;

import java.util.List;
import java.util.Map;

/**
* @Description: 字典列表的包装
* @author chenchen
* @date 2018/6/27 11:59
*/
public class DictWarpper extends BaseControllerWarpper {

    public DictWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        StringBuffer detail = new StringBuffer();
        Integer id = (Integer) map.get("id");
        List<Dict> dicts = ConstantFactory.me().findInDict(id);
        if(dicts != null){
            for (Dict dict : dicts) {
                detail.append(dict.getNum() + ":" +dict.getName() + ",");
            }
            map.put("detail", ToolUtil.removeSuffix(detail.toString(),","));
        }
    }

}
