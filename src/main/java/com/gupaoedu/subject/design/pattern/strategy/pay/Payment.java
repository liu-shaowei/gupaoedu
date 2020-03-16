package com.gupaoedu.subject.design.pattern.strategy.pay;

import com.gupaoedu.subject.design.pattern.ResMsg;

public abstract class Payment {

    public abstract String getName();

    public ResMsg pay(String Uid, double amount){
        return null;
    }
}
