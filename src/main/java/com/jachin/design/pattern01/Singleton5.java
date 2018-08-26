package com.jachin.design.pattern01;

/**
 * 单例模式-延迟实例化
 * 线程安全的
 * 方法3：静态内部类
 * author：Jachin
 * date：2018-08-26
 */
public class Singleton5 {
    // 私有化构造方法
    private Singleton5(){}
    // 实现静态内部类
    private static class Inner{
        private static final Singleton5 instance = new Singleton5();
    }
    // 提供获取实例的访问点
    public static Singleton5 getInstance() {
        return Inner.instance;
    }
}
