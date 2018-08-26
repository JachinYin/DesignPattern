package com.jachin.design.pattern01;

/**
 * 单例模式-延迟实例化
 * 线程不安全的
 * author：Jachin
 * date：2018-08-26
 */
public class Singleton2 {
    // 私有化构造方法
    private Singleton2(){}
    // 赋值为 null ，等待实例化
    private static Singleton2 instance = null;
    // 提供获取实例的访问点
    public static Singleton2 getInstance(){
        if(instance == null)
            instance = new Singleton2();
        return instance;
    }
}
