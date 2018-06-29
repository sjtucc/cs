package com.up.chen.cs.modular.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.up.chen.cs.modular.system.model.LoginLog;
import com.up.chen.cs.modular.system.model.OperationLog;

import java.util.List;
import java.util.Map;

/**
* @Description: 登录记录 服务类
* @author chenchen
* @date 2018/6/27 11:52
*/
public interface ILoginLogService extends IService<LoginLog> {

    /**
     * 获取登录日志列表
     */
    List<Map<String, Object>> getLoginLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String orderByField, boolean asc);
}
