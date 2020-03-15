package com.gupaoedu.subject.design.pattern.bridge;

public class SmsMessage implements IMessage{
    @Override
    public void send(String message, String to) {
        System.out.println(String.format("使用系统消息发送，发送消息 %s给 %s",message, to));
    }
}
