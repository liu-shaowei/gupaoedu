package com.gupaoedu.subject.design.pattern.decorator.homework.V1;

public class LoginDecorator extends TitleDecorator{
    public LoginDecorator(ITitle title) {
        super(title);
    }

    public String getTitle(){
        return super.getTitle()+"--题库";
    }
}
