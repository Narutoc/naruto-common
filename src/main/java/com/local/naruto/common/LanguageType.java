package com.local.naruto.common;

public enum LanguageType {
    ZH_CN(1, "zh-CN"),
    ZH_HK(2, "zh_HK"),
    ZH_TW(3, "zh-TW"),
    EN_GB(4, "en-GB"),
    EN_US(5, "en-US");

    private int code;
    private String language;

    LanguageType(int code, String language) {
        this.code = code;
        this.language = language;
    }
}
