package com;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Test {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("张三三");
        user1.setAge(18);
        user1.setSex("男");
        List<String> list = new ArrayList<String>();
        list.add("篮球");
        list.add("读书");
        user1.setHobbies(list);

        User user2 = user1.jsonDeepClone();
        List<String> list2 = user2.getHobbies();
        list2.add("玩游戏");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1==user2);

    }

}
