package com.local.naruto.exception;

import com.local.naruto.common.Constants;
import lombok.Getter;
import lombok.Setter;
import org.zalando.problem.Status;

@Getter
@Setter
public class BadRequestException extends AbstractBaseException {

    private String entityName;
    private String errorKey;

    public BadRequestException(String errorMessage, String detail) {
        this(errorMessage, detail, null, null);
    }

    public BadRequestException(String errorMessage, String entityName, String errorKey) {
        super(Constants.DEFAULT_TYPE, errorMessage, Status.BAD_REQUEST.getStatusCode(),
            Status.BAD_REQUEST);
        this.entityName = entityName;
        this.errorKey = errorKey;
    }

    public BadRequestException(String errorMessage, String detail, String entityName,
        String errorKey) {
        super(errorMessage, Status.BAD_REQUEST.getStatusCode(), Status.BAD_REQUEST, detail);
        this.entityName = entityName;
        this.errorKey = errorKey;
    }
}
