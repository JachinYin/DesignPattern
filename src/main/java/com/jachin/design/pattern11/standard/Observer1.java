package com.jachin.design.pattern11.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:19
 */
public class Observer1 implements IObserver{
    private final int mark = 1;

    public int getMark() {
        return mark;
    }

    @Override
    public void receive(Object data) {
        System.out.println("Observer1 received data: " + data);
    }
}
