package com.up.chen.cs.core.common.constant.state;

/**
* @Description: 数据库排序
* @author chenchen
* @date 2018/6/27 11:18
*/
public enum Order {

    ASC("asc"), DESC("desc");

    private String des;

    Order(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
