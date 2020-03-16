package com.gupaoedu.subject.design.pattern.strategy;

public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
