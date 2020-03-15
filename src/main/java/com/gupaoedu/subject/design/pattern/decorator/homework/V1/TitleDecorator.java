package com.gupaoedu.subject.design.pattern.decorator.homework.V1;

public class TitleDecorator extends ITitle{
    private ITitle title;

    public TitleDecorator(ITitle title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title.getTitle();
    }
}
