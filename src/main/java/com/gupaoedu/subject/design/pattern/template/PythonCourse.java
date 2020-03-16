package com.gupaoedu.subject.design.pattern.template;

public class PythonCourse extends AbstractCourse {

    @Override
    protected boolean needCheckHomework() {
        return false;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }
}
