package com.gupaoedu.subject.design.pattern.template;

public class JavaCourse extends AbstractCourse {
    private boolean needCheck;

    public void setNeedCheckHomework(boolean needCheck) {
        this.needCheck = needCheck;
    }

    @Override
    protected boolean needCheckHomework() {
        return this.needCheck;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查JAVA作业");
    }
}
