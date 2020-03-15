package com.gupaoedu.subject.design.pattern.facade;

public class Facade {
    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();

    public void doA(){
        subSystemA.doA();
    }

    public void doB(){
        subSystemB.doB();
    }

    public void doC(){
        subSystemC.doC();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
        facade.doB();
        facade.doC();
    }
}
