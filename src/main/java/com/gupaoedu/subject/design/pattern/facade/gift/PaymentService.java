package com.gupaoedu.subject.design.pattern.facade.gift;

public class PaymentService {

    public boolean pay(GiftInfo giftInfo){
        System.out.println("商品："+giftInfo.getName()+"积分支付成功，下单成功");
        return true;
    }
}
