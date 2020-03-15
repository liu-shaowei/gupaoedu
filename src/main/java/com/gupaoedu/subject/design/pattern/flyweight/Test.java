package com.gupaoedu.subject.design.pattern.flyweight;

public class Test {

    public static void main(String[] args) {
        ITicket trainTicket = TicketFactory.queryTrainTicket("北京西", "郑州");
        trainTicket.showInfo("硬座");
        ITicket trainTicket1 = TicketFactory.queryTrainTicket("北京西", "郑州");
        trainTicket1.showInfo("卧铺");
    }
}
