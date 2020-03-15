package com.gupaoedu.subject.design.pattern.adapter.login;

public class PhoneAdapter extends  AbstractLoginAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof PhoneAdapter;
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
