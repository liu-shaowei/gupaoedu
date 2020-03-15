package com.gupaoedu.subject.design.pattern.composite.open;

import java.util.ArrayList;
import java.util.List;

public class CoursePackage extends CourseComponent {
    private String name;
    private Integer level;
    private List<CourseComponent> list = new ArrayList<CourseComponent>();

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent courseComponent) {
        list.add(courseComponent);
    }

    @Override
    public void removeChild(CourseComponent courseComponent) {
        list.remove(courseComponent);
    }

    @Override
    public String getName(CourseComponent courseComponent) {
        return this.getName(courseComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        list.forEach(component->{
            if(this.level!=null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }
                for (int i = 0; i < this.level; i++) {
                    if(i==0) System.out.print("+");
                    System.out.print("-");
                }
            }
            component.print();
        });
    }
}
