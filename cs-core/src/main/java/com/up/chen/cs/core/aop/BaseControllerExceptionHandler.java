package com.up.chen.cs.core.aop;

import com.up.chen.cs.core.base.tips.ErrorTip;
import com.up.chen.cs.core.exception.CsException;
import com.up.chen.cs.core.exception.CsExceptionEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
* @Description: 全局的的异常拦截器
* @author chenchen
* @date 2018/6/26 14:23
*/
public class BaseControllerExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截业务异常
     */
    @ExceptionHandler(CsException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorTip notFount(CsException e) {
        log.error("业务异常:", e);
        return new ErrorTip(e.getCode(), e.getMessage());
    }

    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorTip notFount(RuntimeException e) {
        log.error("运行时异常:", e);
        return new ErrorTip(CsExceptionEnum.SERVER_ERROR.getCode(), CsExceptionEnum.SERVER_ERROR.getMessage());
    }

}
