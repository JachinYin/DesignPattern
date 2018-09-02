package com.jachin.design.pattern16.standard;

import java.util.HashMap;
import java.util.Map;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 19:59
 */
public class FlyweightFactory {
    private FlyweightFactory(){}

    private static FlyweightFactory ff = new FlyweightFactory();
    private Map<String, IFlyweight> map = new HashMap<>();
    public synchronized static FlyweightFactory getInstance(){
        return ff;
    }
    // 增加享元对象，同时也可以有删除，更改享元对象的方法，这里就不一一实现
    public void addFlyweight(String key, IFlyweight f){
        map.put(key, f);
    }
    public synchronized IFlyweight getIFlyweight(String key){
        return map.get(key);
    }
}
