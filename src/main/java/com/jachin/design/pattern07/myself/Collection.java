package com.jachin.design.pattern07.myself;

/**
 * 定义容器类的抽象接口
 * 定义容器类必须维护的元素的增删已经容器大小的功能
 * 并定义了迭代器接口
 */
public interface Collection {
    public void add(Object o);
    public void delete(Object o);
    public int size();
    public Iterator iterator();
}
