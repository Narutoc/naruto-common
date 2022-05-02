package com.local.naruto.common;

public enum StatusType {
    IN_USE(1, "enable"),
    NOT_USE(2, "disable"),
    DELETE(3, "delete"),
    DRAFT(4, "draft");

    private int code;
    private String status;

    StatusType(int code, String status) {
        this.code = code;
        this.status = status;
    }
}
