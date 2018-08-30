package com.jachin.design.pattern08.reflect;

import java.lang.reflect.Method;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/29 9:35
 */
public class ShapeVisitor implements IVisitor<Triangle>{

    public Object getCenter(Triangle t){
        return "\tget 重心";
    }

    public Object getOuterCircle(){
        return "\tget 外圆";
    }

    @Override
    public Object visit(Triangle triangle, String method) {
        Object result = null;
        Class c = getClass();
        try {
            Method mt = c.getMethod(method, Triangle.class);
            result = mt.invoke(this, new Object[]{triangle});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
