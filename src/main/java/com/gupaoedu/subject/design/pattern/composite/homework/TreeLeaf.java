package com.gupaoedu.subject.design.pattern.composite.homework;

public class TreeLeaf extends TreeNode{
    public TreeLeaf(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
