package com.gupaoedu.subject.design.pattern.delegate;

public class EmployeeA implements IEmployee {
    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + "现在我开始做" + task + "工作");
    }
}
