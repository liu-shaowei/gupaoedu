package com.gupaoedu.subject.design.pattern.adapter.login;

public interface ILoginAdapter {
    boolean support(Object adapter);
    ResMsg login(String id, Object adapter);
}
