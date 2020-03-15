package com.gupaoedu.subject.design.pattern.bridge;

public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    public void send(String message, String to){
        this.message.send(message, to);
    }
}
