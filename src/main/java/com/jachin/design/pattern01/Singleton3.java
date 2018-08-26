package com.jachin.design.pattern01;

/**
 * 单例模式-延迟实例化
 * 线程安全
 * 方法1：完全同步方法
 * author：Jachin
 * date：2018-08-26
 */
public class Singleton3 {
    // 私有化构造方法
    private Singleton3(){}
    // 赋值为 null ，等待实例化
    private static Singleton3 instance = null;
    // 提供获取实例的访问点
    public static synchronized Singleton3 getInstance(){
        if(instance == null)
            instance = new Singleton3();
        return instance;
    }
}
