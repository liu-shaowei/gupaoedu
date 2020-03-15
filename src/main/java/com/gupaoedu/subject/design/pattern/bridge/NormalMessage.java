package com.gupaoedu.subject.design.pattern.bridge;

public class NormalMessage extends AbstractMessage{

    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void send(String message, String to) {
        super.send(message, to);
    }
}
