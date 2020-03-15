package com.gupaoedu.subject.design.pattern.facade.gift;

public class GiftFacade {
   private QualifyService qualifyService = new QualifyService();
   private PaymentService paymentService = new PaymentService();
   private ShoppingService shoppingService = new ShoppingService();

    //1.校验是否可兑换
    //2.支付积分下单
    //3.物流发送
    public void exchangeGift(GiftInfo giftInfo){
        if(qualifyService.isAvailable(giftInfo)){
            if(paymentService.pay(giftInfo)){
                String orderNo = shoppingService.delivery(giftInfo);
                System.out.println(giftInfo.getName()+"兑换成功，物流单号："+orderNo);
            }
        }

    }
}
