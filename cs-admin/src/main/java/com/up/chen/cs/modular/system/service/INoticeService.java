package com.up.chen.cs.modular.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.up.chen.cs.modular.system.model.Notice;

import java.util.List;
import java.util.Map;

/**
* @Description: 通知表 服务类
* @author chenchen
* @date 2018/6/27 11:53
*/
public interface INoticeService extends IService<Notice> {

    /**
     * 获取通知列表
     */
    List<Map<String, Object>> list(String condition);
}
