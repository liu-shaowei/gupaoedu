package com.gupaoedu.subject.design.pattern.decorator.homework.V1;

public class Test {

    public static void main(String[] args) {
        UnLoginTitle unLoginTitle = new UnLoginTitle();
        System.out.println("未登录用户");
        System.out.println(unLoginTitle.getTitle());
        LoginDecorator loginDecorator = new LoginDecorator(unLoginTitle);
        System.out.println("已登录用户");
        System.out.println(loginDecorator.getTitle());
        LoginVipDecorator loginVipDecorator = new LoginVipDecorator(loginDecorator);
        System.out.println("已登录会员");
        System.out.println(loginVipDecorator.getTitle());
        AdminDecorator adminDecorator = new AdminDecorator(loginVipDecorator);
        System.out.println("管理员用户");
        System.out.println(adminDecorator.getTitle());
    }

}
