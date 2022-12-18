package com.frame.common.core.exception;
/**
 * @author LiuQi
 * @version 1.0
 * @data 2022/12/15 16:41
 * 业务异常 处理 需要加载全局异常 在frame-common-security模块
 */
public final class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误提示
     */
    private String errorMessage;

    /**
     * 错误明细，内部调试错误
     *
     * 和 {@link CommonResult#getDetailMessage()} 一致的设计
     */
    private String errorDetailMessage;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException()
    {
    }

    public ServiceException(String message)
    {
        this.errorMessage = message;
    }

    public ServiceException(String message, Integer code)
    {
        this.errorMessage = message;
        this.errorCode = code;
    }

    public String getErrorDetailMessage()
    {
        return errorDetailMessage;
    }

    @Override
    public String getMessage()
    {
        return errorMessage;
    }

    public Integer getErrorCode()
    {
        return errorCode;
    }

    public ServiceException setErrorMessage(String message)
    {
        this.errorMessage = message;
        return this;
    }

    public ServiceException setErrorDetailMessage(String detailMessage)
    {
        this.errorMessage = detailMessage;
        return this;
    }
}
