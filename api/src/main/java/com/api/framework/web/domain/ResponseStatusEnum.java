package com.api.framework.web.domain;

/**
 * 请求状态
 */
public enum ResponseStatusEnum {

    SUCCESS(0, "成功!"),
    AUTH(-1, "未认证!"),
    Fail(-2, "失败!");

    /**
     * 状态值
     */
    private int code;

    /**
     * 状态名称
     */
    private String name;

    private ResponseStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
