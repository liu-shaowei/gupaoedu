package com.gupaoedu.subject.design.pattern.composite.safe;

public class File extends Directory{
    public File(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
