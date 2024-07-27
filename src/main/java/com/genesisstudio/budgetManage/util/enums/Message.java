package com.genesisstudio.budgetManage.util.enums;

import lombok.Getter;

@Getter
public enum Message {
    SUCCESS("SUCCESS"),
    FAIL("FAIL"),
    NO_DATA("No data available!"),
    LOGIN_FAIL("Check your email or password"),;
    private final String msg;
    Message(String msg){
        this.msg=msg;
    }
}
