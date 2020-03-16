package com.gupaoedu.subject.design.pattern.adapter.login;

import com.gupaoedu.subject.design.pattern.ResMsg;

public class WeChatAdapter extends  AbstractLoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof WeChatAdapter;
    }

    @Override
    public ResMsg login(String id, Object adapter) {
        if(support(adapter)){
            return super.login(id, null);
        }else{
            return null;
        }

    }
}
