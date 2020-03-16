package com.gupaoedu.subject.design.pattern.strategy;

public class GroupBuyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("5人成团购买");
    }
}
