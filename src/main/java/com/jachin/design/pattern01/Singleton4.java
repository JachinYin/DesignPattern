package com.jachin.design.pattern01;

/**
 * 单例模式-延迟实例化
 * 线程安全的
 * 方法2：部分同步方法（双重校验锁DCL）
 * author：Jachin
 * date：2018-08-26
 */
public class Singleton4 {
    // 私有化构造方法
    private Singleton4(){}
    // 赋值为 null ，等待实例化
    private static Singleton4 instance = null;
    // 提供获取实例的访问点
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if(instance == null)
                    instance = new Singleton4();
            }
        }
        return instance;
    }
}
