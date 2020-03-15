package com.gupaoedu.subject.design.pattern.adapter.login;

public abstract class AbstractLoginAdapter extends PassportService implements ILoginAdapter{

    protected ResMsg loginForRegister(String name, String password){
        if(password == null ||"".equals(password)){
            password = "THIRD_LOGIN";
        }
        return super.register(name,password);
    }
}
