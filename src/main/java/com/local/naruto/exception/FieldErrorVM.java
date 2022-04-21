package com.local.naruto.exception;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
public class FieldErrorVM implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String objectName;
    private final String field;
    private final String message;

    public FieldErrorVM(String objectName, String field, String message) {
        this.objectName = objectName;
        this.field = field;
        this.message = message;
    }
}
