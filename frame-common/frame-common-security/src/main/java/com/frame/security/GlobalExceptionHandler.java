package com.frame.security;

import cn.hutool.http.server.HttpServerRequest;
import com.frame.core.exception.ServiceException;
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
public class GlobalExceptionHandler
{
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 业务异常
     */
    @ExceptionHandler(value = ServiceException.class)
    public  void  handleServiceException(ServiceException ex, HttpServerRequest request){

    }
}
