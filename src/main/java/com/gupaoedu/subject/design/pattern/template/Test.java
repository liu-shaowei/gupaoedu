package com.gupaoedu.subject.design.pattern.template;

public class Test {

    public static void main(String[] args) {
        System.out.println("=============================================");
        JavaCourse java = new JavaCourse();
        java.setNeedCheckHomework(true);
        java.createCourse();
        System.out.println("=============================================");
        PythonCourse python = new PythonCourse();
        python.createCourse();
    }
}
