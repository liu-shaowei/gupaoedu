package com.gupaoedu.subject.design.pattern.decorator.homework.V1;

public class LoginVipDecorator extends TitleDecorator{
    public LoginVipDecorator(ITitle title) {
        super(title);
    }

    public String getTitle(){
        return super.getTitle()+"--作业--成长墙";
    }
}
