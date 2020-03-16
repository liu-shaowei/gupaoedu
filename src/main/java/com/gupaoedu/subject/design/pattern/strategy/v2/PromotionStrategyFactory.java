package com.gupaoedu.subject.design.pattern.strategy.v2;

import com.gupaoedu.subject.design.pattern.strategy.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {
    }

    private static Map<String, IPromotionStrategy> PROMOTION = new HashMap<>();

    private interface PromotionKey{
        String CASH_BACK = "CASH_BACK";
        String COUPON = "COUPON";
        String GROUP_BUY = "GROUP_BUY";
    }

    static {
        PROMOTION.put(PromotionKey.CASH_BACK, new CashBackStrategy());
        PROMOTION.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
    }

    public static Set<String> getPromotionKeys(){
        return  PROMOTION.keySet();
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTION.get(promotionKey);
        return strategy == null? EMPTY : strategy;
    }


}
