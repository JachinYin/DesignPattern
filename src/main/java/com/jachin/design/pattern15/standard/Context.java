package com.jachin.design.pattern15.standard;

import java.util.HashMap;
import java.util.Map;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 11:48
 */
public class Context {
    Map<String, Double> map = new HashMap<>();
    void assign(String key, double value){
        map.put(key, value);
    }
}
