package com.jachin.design.pattern08.reflect;

public interface IShape {
    float getArea();
    float getLength();
    Object accept(IVisitor v, String method);
}
