package com.gupaoedu.subject.design.pattern.adapter.power;

public class DC220 {
    public int output220V(){
        int output = 220;
        System.out.println("输出电压" + output +"V");
        return output;
    };
}
