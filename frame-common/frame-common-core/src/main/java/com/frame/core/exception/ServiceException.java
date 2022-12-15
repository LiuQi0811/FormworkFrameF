package com.frame.core.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 16:41
 * 业务异常 处理 需要加载全局异常 在frame-common-security模块
 */
public final class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private Integer errorCode; //错误码
    private String errorMessage; //错误提示
    private String errorDetailMessage; // 错误明细，内部调试错误

    public ServiceException() {
        // 空构造方法，避免反序列化问题
    }
    public ServiceException(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public ServiceException(String errorMessage, Integer errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public Integer getErrorCode(){
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ServiceException setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public String getErrorDetailMessage() {
        return errorDetailMessage;
    }

    public ServiceException setErrorDetailMessage(String errorDetailMessage) {
        this.errorDetailMessage = errorDetailMessage;
        return this;
    }
}
