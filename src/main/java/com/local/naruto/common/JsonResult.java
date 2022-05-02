package com.local.naruto.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonResult<T> {

    private int status;
    private T data;
    private String message;
    private int size;

    public JsonResult() {
        this.status = Constants.INT_200;
        this.message = "OK";
    }

    public JsonResult(T data) {
        this();
        this.data = data;
    }

    public JsonResult(T data, int size) {
        this(data);
        this.size = size;
    }

    public JsonResult(int status, T data, String message, int size) {
        this.status = status;
        this.data = data;
        this.message = message;
        this.size = size;
    }
}
