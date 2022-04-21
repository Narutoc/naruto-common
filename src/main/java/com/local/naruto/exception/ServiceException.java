package com.local.naruto.exception;

import com.local.naruto.common.Constants;
import org.apache.log4j.Logger;

public class ServiceException extends RuntimeException {
    private int code;
    private String message;

    private static final Logger LOG = Logger.getLogger(ServiceException.class);

    public ServiceException() {
    }

    /**
     * 带返回码的构造函数
     *
     * @param code    错误码
     * @param message 错误信息
     */
    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 仅有错误信息的构造函数
     *
     * @param message 错误信息
     */
    public ServiceException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * 构造函数
     *
     * @param code    错误码
     * @param message 错误信息
     * @param cause   异常
     */
    public ServiceException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    /**
     * 参数错误
     *
     * @param message 错误信息
     */
    public static ServiceException paramException(String message) {
        return new ServiceException(Constants.INT_400, message);
    }

    /**
     * 服务器异常
     *
     * @param message 错误信息
     */
    public static ServiceException serverException(String message) {
        return new ServiceException(Constants.INT_500, message);
    }

    /**
     * 服务器异常
     *
     * @param message 错误信息
     * @param ex      异常
     */
    public static ServiceException serverException(String message, Exception ex) {
        return new ServiceException(Constants.INT_500, message, ex);
    }
}
