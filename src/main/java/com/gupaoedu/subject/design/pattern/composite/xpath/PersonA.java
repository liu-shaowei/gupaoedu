package com.gupaoedu.subject.design.pattern.composite.xpath;

public class PersonA implements Person {
    @Override
    public String getName() {
        return "张三";
    }

    public static void main(String[] args) {
        Person person = new PersonA();
        System.out.println(person.getName());
    }
}
