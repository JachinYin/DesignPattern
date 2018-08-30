package com.jachin.design.pattern08.reflect;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/29 9:35
 */
public class Triangle implements IShape {

    private float x1,y1,x2,y2,x3,y3;

    @Override
    public float getArea() {
        return 0;
    }

    @Override
    public float getLength() {
        return 0;
    }

    @Override
    public Object accept(IVisitor v, String method) {
        return v.visit(this, method);
    }
}
