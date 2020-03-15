package com.gupaoedu.subject.design.pattern.decorator.battercake;

public abstract class BatterCakeDecorator extends BatterCake{

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake){
        this.batterCake = batterCake;
    }

    public abstract void doSomething();

    @Override
    public String getMessage(){
        return this.batterCake.getMessage();
    }

    @Override
    public double getPrice(){
        return this.batterCake.getPrice();
    }

}
