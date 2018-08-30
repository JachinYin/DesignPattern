package com.jachin.design.pattern08.reflect;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/29 9:17
 */
public class Test {
    public static void main(String[] args) {
        IVisitor visitor = new ShapeVisitor();
        Triangle t = new Triangle();
        t.accept(visitor, "getOuterCircle");
        t.accept(visitor, "getCenter");
    }
}
