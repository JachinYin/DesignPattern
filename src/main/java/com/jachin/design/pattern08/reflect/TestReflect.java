package com.jachin.design.pattern08.reflect;

import java.lang.reflect.Method;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/29 10:43
 */
public class TestReflect {

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
    }

    public static void reflect(Triangle t, String method) {
        Class c = null;
        try {
            c = Class.forName("com.jachin.design.pattern08.reflect.Triangle");
            Method mt = c.getMethod(method, Triangle.class);
            mt.invoke(t, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        reflect(t, "getArea");
    }
}
