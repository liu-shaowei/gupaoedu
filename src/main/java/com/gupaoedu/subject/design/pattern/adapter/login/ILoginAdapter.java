package com.gupaoedu.subject.design.pattern.adapter.login;

import com.gupaoedu.subject.design.pattern.ResMsg;

public interface ILoginAdapter {
    boolean support(Object adapter);
    ResMsg login(String id, Object adapter);
}
