package com.gupaoedu.subject.design.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abm = new NormalMessage(message);
        abm.send("该吃饭了","张三");

        message = new EmailMessage();
        abm = new UrgencyMessage(message);
        abm.send("快回家","李四");
    }
}
