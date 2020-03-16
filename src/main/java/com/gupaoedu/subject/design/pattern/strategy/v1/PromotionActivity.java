package com.gupaoedu.subject.design.pattern.strategy.v1;

import com.gupaoedu.subject.design.pattern.strategy.IPromotionStrategy;

public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.doPromotion();
    }
}
