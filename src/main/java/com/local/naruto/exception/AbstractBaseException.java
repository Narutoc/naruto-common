package com.local.naruto.exception;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

@Getter
@Setter
public class AbstractBaseException extends AbstractThrowableProblem {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBaseException.class);

    private static final String ERROR_INFO = "{\"errorCode\":{},\"errorMessage\":\"{}\"}";

    private int errorCode;
    private String errorMessage;
    private Object[] args;

    public AbstractBaseException() {
    }

    public AbstractBaseException(URI type, String errorMessage, int errorCode, Status status) {
        super(type, null, status);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        LOGGER.error(ERROR_INFO, errorCode, errorMessage);
    }

    public AbstractBaseException(String errorMessage, int errorCode, Status status,
        Object... args) {
        super(null, null, status);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.args = args;
        LOGGER.error(ERROR_INFO, errorCode, errorMessage);
    }

    public AbstractBaseException(String errorMessage, int errorCode, Status status,
        String details) {
        super(null, null, status, details);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        LOGGER.error(ERROR_INFO, errorCode, errorMessage);
    }
}
