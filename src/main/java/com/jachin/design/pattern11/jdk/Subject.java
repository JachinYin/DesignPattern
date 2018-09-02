package com.jachin.design.pattern11.jdk;

import java.util.Observable;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 11:01
 */
public class Subject extends Observable {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
