package com.jachin.design.pattern08.standard;

public interface IVisitor<T> {
    Object visit(T t);
}
