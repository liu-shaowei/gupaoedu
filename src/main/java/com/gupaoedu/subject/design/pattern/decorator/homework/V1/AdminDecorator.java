package com.gupaoedu.subject.design.pattern.decorator.homework.V1;

public class AdminDecorator extends TitleDecorator {
    public AdminDecorator(ITitle title) {
        super(title);
    }

    public String getTitle(){
        return super.getTitle()+"--用户管理";
    }
}
