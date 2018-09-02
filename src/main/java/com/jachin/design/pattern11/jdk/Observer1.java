package com.jachin.design.pattern11.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 11:01
 */
public class Observer1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((Subject)o).getData());
    }
}
