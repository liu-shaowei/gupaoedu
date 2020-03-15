package com.gupaoedu.subject.design.pattern.decorator.battercake;

public class Test {

    public static void main(String[] args) {
        BaseBatterCake baseBatterCake = new BaseBatterCake();
        System.out.println(baseBatterCake.getMessage()+"，价格："+baseBatterCake.getPrice()+"元");
        EggDecorator eggDecorator = new EggDecorator(baseBatterCake);
        System.out.println(eggDecorator.getMessage()+"，价格："+eggDecorator.getPrice()+"元");
    }


}
