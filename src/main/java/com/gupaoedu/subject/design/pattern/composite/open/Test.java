package com.gupaoedu.subject.design.pattern.composite.open;

public class Test {

    public static void main(String[] args) {
        System.out.println("===========透明组合模式=============");
        CourseComponent coursePackage = new CoursePackage("java架构师课程",2);
        CourseComponent design = new Course("设计模式", 5000);
        CourseComponent source = new Course("源码分析", 4000);
        CourseComponent softKill = new Course("软技能", 3000);
        coursePackage.addChild(design);
        coursePackage.addChild(source);
        coursePackage.addChild(softKill);

        CourseComponent catalog = new CoursePackage("主目录",1);
        CourseComponent javaBase = new Course("java入门课程",8000);
        CourseComponent ai = new Course("人工智能", 9000);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(coursePackage);

        catalog.print();




    }
}
