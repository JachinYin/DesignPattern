package com.jachin.design.pattern08.standard;

public interface IShape {
    float getLength();
    float getArea();
    // 为没有考虑都的功能留下空间
    Object accept(IVisitor visitor);
}
