package com.gupaoedu.subject.design.pattern.adapter.login;

import com.gupaoedu.subject.design.pattern.ResMsg;

public interface IPassportForThird {
    ResMsg loginForQQ(String openId);
    ResMsg loginForWeChat(String openId);
    ResMsg loginForToken(String token);
    ResMsg loginForPhone(String phone, String code);
}
