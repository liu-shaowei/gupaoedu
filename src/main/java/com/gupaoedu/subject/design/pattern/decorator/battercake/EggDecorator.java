package com.gupaoedu.subject.design.pattern.decorator.battercake;

public class EggDecorator extends BatterCakeDecorator{

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    public void doSomething() {

    }

    @Override
    public String getMessage(){
        return super.getMessage()+"+一个鸡蛋";
    }

    @Override
    public double getPrice(){
        return super.getPrice()+2;
    }
}
