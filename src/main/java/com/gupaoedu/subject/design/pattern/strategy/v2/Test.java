package com.gupaoedu.subject.design.pattern.strategy.v2;

import com.gupaoedu.subject.design.pattern.strategy.IPromotionStrategy;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> strategyKeySet = PromotionStrategyFactory.getPromotionKeys();
        strategyKeySet.stream().forEach(key->{
            System.out.println(key);
            IPromotionStrategy strategy = PromotionStrategyFactory.getPromotionStrategy(key);
            strategy.doPromotion();
        });
    }
}
