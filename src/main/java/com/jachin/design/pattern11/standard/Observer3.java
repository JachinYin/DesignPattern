package com.jachin.design.pattern11.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:19
 */
public class Observer3 implements IObserver{
    @Override
    public void receive(Object data) {
        System.out.println("Observer3 received data: " + data);
    }
}
