package com.gupaoedu.subject.design.pattern.adapter.power;

public class PowerAdapter implements DC5{
    private DC220 dc220;

    public PowerAdapter(DC220 dc220) {
        this.dc220 = dc220;
    }

    @Override
    public int output5V() {
        int adapterInput = this.dc220.output220V();
        int adapterOutput = adapterInput/44;
        System.out.println("输入电压："+adapterInput+"V"+"输出电压"+adapterOutput);
        return adapterOutput;
    }

    @Override
    public int output10V() {
        return 0;
    }
}
