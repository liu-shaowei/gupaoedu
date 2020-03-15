package com.gupaoedu.subject.design.pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Directory{
    private Integer level;

    private List<Directory> dirs = new ArrayList<>();

    public Folder(String name, Integer level) {
        super(name);
        this.level = level;
    }

    public boolean add(Directory dir){
        return this.dirs.add(dir);
    }

    public boolean remove(Directory dir){
        return this.dirs.remove(dir);
    }

    public Directory get(int i){
        return this.dirs.get(i);
    }

    public void list(){
        this.dirs.forEach(dir->{
            System.out.println(dir.name);
        });
    }

    @Override
    public void show() {
        System.out.println(this.name);
        this.dirs.forEach(dir->{
            if(this.level != null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }

                for (int i = 0; i < this.level; i++) {
                    if(i==0) System.out.print("+");
                    System.out.print("-");
                }
            }
            dir.show();
        });

    }
}
