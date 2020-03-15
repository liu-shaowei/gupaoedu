package com.gupaoedu.subject.design.pattern.delegate;

public class Boss {
    public void command(String task, Leader leader){
        leader.doing(task);
    }
}
