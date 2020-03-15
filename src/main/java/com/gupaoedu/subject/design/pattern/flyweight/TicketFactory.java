package com.gupaoedu.subject.design.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

    private static Map<String, ITicket> pool = new ConcurrentHashMap<String, ITicket>();

    public static ITicket queryTrainTicket(String from, String to){
        String key = from +"-->" + to;
        if(!pool.containsKey(key)){
            System.out.println("首次查询，创建对象，"+key);
            pool.put(key, new TrainTicket(from ,to));
        }else{
            System.out.println("使用缓存，创建对象，"+key);
        }
        return pool.get(key);
    }

}
