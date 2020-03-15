package com.gupaoedu.subject.design.pattern.composite.homework;

public abstract class TreeNode {
    protected String name;

    public TreeNode(String name) {
        this.name = name;
    }

    public abstract void show();
}
