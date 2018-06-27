package com.up.chen.cs.core.base.tips;

/**
* @Description: 返回给前台的成功提示
* @author chenchen
* @date 2018/6/26 15:01
*/
public class SuccessTip extends Tip {
	public SuccessTip(){
		super.code = 200;
		super.message = "操作成功";
	}
}