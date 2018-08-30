package com.jachin.design.pattern11;

import java.util.Vector;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:24
 */
public class Subject implements ISubject{
    private Vector<IObserver> v = new Vector<>();
    private String data;

    public void setData(String data) {
        this.data = data;
        notifyObserver();
    }

    @Override
    public boolean register(IObserver o) {
        v.add(o);
        return true;
    }

    @Override
    public boolean delete(IObserver o) {
        v.remove(o);
        return true;
    }

    @Override
    public boolean notifyObserver() {
        for(IObserver o : v){
            o.receive(data);
        }
        return true;
    }
}
