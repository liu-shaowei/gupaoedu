package com.gupaoedu.subject.design.pattern.adapter.login;

import lombok.Data;

@Data
public class ResMsg {
    private String Code;
    private String msg;
    private Object data;

    public ResMsg(String code, String msg, Object data) {
        Code = code;
        this.msg = msg;
        this.data = data;
    }
}
