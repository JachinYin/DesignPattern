package com.jachin.design.pattern11.standard;

public interface ISubject {
    // 注册观察者，撤销观察者，通知观察者
    boolean register(IObserver o);
    boolean delete(IObserver o);
    boolean notifyObserver();
}
