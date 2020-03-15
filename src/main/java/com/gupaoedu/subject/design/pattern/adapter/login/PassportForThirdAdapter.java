package com.gupaoedu.subject.design.pattern.adapter.login;

public class PassportForThirdAdapter implements IPassportForThird{
    @Override
    public ResMsg loginForQQ(String openId) {
        return processLogin(openId, QQAdapter.class);
    }

    @Override
    public ResMsg loginForWeChat(String openId) {
        return processLogin(openId, WeChatAdapter.class);
    }

    @Override
    public ResMsg loginForToken(String token) {
        return processLogin(token, TokenAdapter.class);
    }

    @Override
    public ResMsg loginForPhone(String phone, String code) {
        return processLogin(phone, PhoneAdapter.class);
    }

    private ResMsg processLogin(String openId, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(openId, adapter);
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw  new RuntimeException("不支持的登录");
        }
    }
}
