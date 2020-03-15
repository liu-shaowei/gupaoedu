package com.gupaoedu.subject.design.pattern.flyweight;

import java.util.Random;

public class TrainTicket implements ITicket{

    private String from;
    private String to;
    private double price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s-->%s，%s价格为：%s",this.from,this.to,bunk,this.price));
    }
}
