package com.jachin.design.pattern01;

/**
 * 单例模式-直接实例化
 * author：Jachin
 * date：2018-08-26
 */
public class Singleton {
    // 私有化构造方法
    private Singleton(){}
    // 直接创建单例实例
    private static final Singleton instance = new Singleton();
    // 提供获取实例的访问点
    public static Singleton getInstance(){
        return instance;
    }
}
