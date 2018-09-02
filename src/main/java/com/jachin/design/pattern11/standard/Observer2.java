package com.jachin.design.pattern11.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:19
 */
public class Observer2 implements IObserver{
    @Override
    public void receive(Object data) {
        System.out.println("Observer2 received data: " + data);
    }
}
