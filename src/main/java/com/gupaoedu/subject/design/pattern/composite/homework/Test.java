package com.gupaoedu.subject.design.pattern.composite.homework;

public class Test {

    public static void main(String[] args) {
        TreeFactory factory = new TreeFactory();
        TreeBranch tree = factory.buildTree();
        tree.show();
    }

}
