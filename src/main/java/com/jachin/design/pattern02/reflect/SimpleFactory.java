package com.jachin.design.pattern02.reflect;

public class SimpleFactory {
    public static ICar create(String className){

        ICar obj = null;

        try {
            Class c = Class.forName(className);
            obj = (ICar) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
