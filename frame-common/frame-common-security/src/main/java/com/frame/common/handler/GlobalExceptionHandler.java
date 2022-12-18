package com.frame.common.handler;

import cn.hutool.http.server.HttpServerRequest;
import com.frame.common.core.exception.ServiceException;
import com.frame.common.core.utils.StringUtils;
import com.frame.common.core.web.domain.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 17:17
 * 处理全局异常 可自定义配置
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 业务异常
     */
    @ExceptionHandler(value = ServiceException.class)
    public AjaxResult handleServiceException(ServiceException e, HttpServerRequest request) {
        log.error(e.getMessage(), e);
        Integer code = e.getErrorCode(); // 错误状态码
        //三目运算 判断返回结果
        return StringUtils.isNotNull(code) ? AjaxResult.error(code, e.getMessage()) : AjaxResult.error(e.getMessage());
    }
}
