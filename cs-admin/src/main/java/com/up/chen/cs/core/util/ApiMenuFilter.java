package com.up.chen.cs.core.util;

import com.up.chen.cs.config.properties.CsProperties;
import com.up.chen.cs.core.common.constant.Const;
import com.up.chen.cs.core.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
* @Description: api接口文档显示过滤
* @author chenchen
* @date 2018/6/27 11:34
*/
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        CsProperties csProperties = SpringContextHolder.getBean(CsProperties.class);
        if (!csProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
