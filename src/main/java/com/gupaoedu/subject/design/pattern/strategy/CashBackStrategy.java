package com.gupaoedu.subject.design.pattern.strategy;

public class CashBackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现优惠");
    }
}
