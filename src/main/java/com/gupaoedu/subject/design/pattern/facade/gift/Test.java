package com.gupaoedu.subject.design.pattern.facade.gift;

public class Test {

    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setName("JAVA并发编程艺术");
        GiftFacade facade = new GiftFacade();
        facade.exchangeGift(giftInfo);
    }
}
