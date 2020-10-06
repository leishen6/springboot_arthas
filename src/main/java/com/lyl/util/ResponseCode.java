package com.lyl.util;

/**
 * 使用枚举类封装好的响应状态码及对应的响应消息
 */
public enum ResponseCode {

    SUCCESS(1200, "success"),

    ERROR(1400, "fail");


    private Integer code;

    private String message;

    private ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

}
