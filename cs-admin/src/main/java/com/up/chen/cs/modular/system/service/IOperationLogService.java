package com.up.chen.cs.modular.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.up.chen.cs.modular.system.model.OperationLog;

import java.util.List;
import java.util.Map;

/**
* @Description: 操作日志 服务类
* @author chenchen
* @date 2018/6/27 11:53
*/
public interface IOperationLogService extends IService<OperationLog> {

    /**
     * 获取操作日志列表
     */
    List<Map<String, Object>> getOperationLogs(Page<OperationLog> page, String beginTime, String endTime, String logName, String s, String orderByField, boolean asc);
}
