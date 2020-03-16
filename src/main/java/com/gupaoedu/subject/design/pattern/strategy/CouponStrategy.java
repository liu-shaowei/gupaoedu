package com.gupaoedu.subject.design.pattern.strategy;

public class CouponStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券折扣");
    }
}
