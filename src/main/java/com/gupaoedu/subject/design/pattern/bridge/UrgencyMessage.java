package com.gupaoedu.subject.design.pattern.bridge;

public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void send(String message, String to) {
        message = "【加急】" + message;
        super.send(message, to);
    }

    public Object watch(String messageId){
        //根据messageId查询消息状态
        return null;
    }
}
