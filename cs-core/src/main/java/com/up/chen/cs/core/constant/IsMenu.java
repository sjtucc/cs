package com.up.chen.cs.core.constant;

/**
* @Description: 是否是菜单的枚举
* @author chenchen
* @date 2018/6/26 15:54
*/

public enum IsMenu {

    YES(1, "是"),
    NO(0, "不是");//不是菜单的是按钮

    private int code;
    private String message;

    IsMenu(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String valueOf(Integer code) {
        if (code == null) {
            return "";
        } else {
            for (IsMenu s : IsMenu.values()) {
                if (s.getCode() == code) {
                    return s.getMessage();
                }
            }
            return "";
        }
    }

}
