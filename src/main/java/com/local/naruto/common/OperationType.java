package com.local.naruto.common;

public enum OperationType {
    CREATE(1, "create"),
    UPDATE(2, "update"),
    DELETE(3, "delete"),
    REVERT(4, "revert");

    private int code;
    private String description;

    OperationType(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
