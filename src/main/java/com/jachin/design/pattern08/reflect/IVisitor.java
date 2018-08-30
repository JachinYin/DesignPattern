package com.jachin.design.pattern08.reflect;

public interface IVisitor<T> {
    Object visit(T t, String method);
}
