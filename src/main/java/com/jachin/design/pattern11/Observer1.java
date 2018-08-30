package com.jachin.design.pattern11;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:19
 */
public class Observer1 implements IObserver{
    @Override
    public void receive(Object data) {
        System.out.println("Observer1 received data: " + data);
    }
}
