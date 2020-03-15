package com.gupaoedu.subject.design.pattern.composite.homework;

import java.util.ArrayList;
import java.util.List;

public class TreeBranch extends TreeNode {
    private List<TreeNode> item = null;
    private Integer level;

    public TreeBranch(String name, Integer level) {
        super(name);
        this.level = level;
        item = new ArrayList<>();
    }

    public boolean add(TreeNode treeNode){
       return this.item.add(treeNode);
    }

    public boolean remove(TreeNode treeNode){
        return this.item.remove(treeNode);
    }

    public TreeNode get(int i){
        return this.item.get(i);
    }

    public void list(){
        this.item.forEach(e->{
            System.out.println(e.name);
        });
    }

    @Override
    public void show() {
        System.out.println(this.name);
        this.item.forEach(node->{
            if(this.level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }

                for (int i = 0; i < this.level; i++) {
                    if(i==0) System.out.print("+");
                    System.out.print("-");
                }
            }
            node.show();
        });
    }
}
