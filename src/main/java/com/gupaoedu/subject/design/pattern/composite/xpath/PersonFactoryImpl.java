package com.gupaoedu.subject.design.pattern.composite.xpath;

public class PersonFactoryImpl extends PersonFactory{
    @Override
    public Person newInstance() {
        return new PersonA();
    }
}
