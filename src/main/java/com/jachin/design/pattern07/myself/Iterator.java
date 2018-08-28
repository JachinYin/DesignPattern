package com.jachin.design.pattern07.myself;

/**
 * @des:
 * 迭代器的抽象接口
 * 定义了容器的 hasNext 方法和 next 方法
 * @author: Jachin
 * @date: 2018/8/27 20:25
 */
public interface Iterator {
    Object next();
    boolean hasNext();
}
