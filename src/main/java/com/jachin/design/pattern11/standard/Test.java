package com.jachin.design.pattern11.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 21:19
 */
public class Test {
    public static void main(String[] args) {
        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        Observer3 o3 = new Observer3();
        Observer3 o4 = new Observer3();
        Subject subject = new Subject();
        subject.register(o1);
        subject.register(o2);
        subject.register(o3);
        subject.register(o4);
        subject.setData("233");
        subject.delete(o3);
        subject.setData("4555");
    }
}
