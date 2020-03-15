package com.gupaoedu.subject.design.pattern.facade.gift;

public class ShoppingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println("物流接收：商品"+giftInfo.getName());
        return "666";
    }
}
