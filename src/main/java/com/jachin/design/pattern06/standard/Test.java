package com.jachin.design.pattern06.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/28 17:32
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher(s);
        Invoke invoke = new Invoke(t);
        invoke.execute();
    }
}
