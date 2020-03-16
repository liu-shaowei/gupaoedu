package com.gupaoedu.subject.design.pattern.strategy.v1;

import com.gupaoedu.subject.design.pattern.strategy.CashBackStrategy;
import com.gupaoedu.subject.design.pattern.strategy.CouponStrategy;

public class Test {
    public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CashBackStrategy());
        activity618.execute();
        PromotionActivity activity1111 = new PromotionActivity(new CouponStrategy());
        activity1111.execute();
    }
}
