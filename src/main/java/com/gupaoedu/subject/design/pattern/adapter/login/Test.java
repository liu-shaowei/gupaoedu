package com.gupaoedu.subject.design.pattern.adapter.login;

import com.gupaoedu.subject.design.pattern.ResMsg;

public class Test {

    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        ResMsg resMsg =adapter.loginForQQ("1231412ada");
        System.out.println(resMsg.getMsg());
    }
}
