package com.jachin.design.pattern11;

public interface IObserver {
    // 观察者只需要定义消息通知的方法
    void receive(Object data);
}
