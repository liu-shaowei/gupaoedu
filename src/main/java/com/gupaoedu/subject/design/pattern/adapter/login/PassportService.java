package com.gupaoedu.subject.design.pattern.adapter.login;

import com.gupaoedu.subject.design.pattern.ResMsg;

public class PassportService {
    public ResMsg register(String name, String password){
        return new ResMsg("0000","注册成功",new Member());
    }

    public ResMsg login(String name, String password){
        return new ResMsg("0000","登录成功",null);
    }
}
