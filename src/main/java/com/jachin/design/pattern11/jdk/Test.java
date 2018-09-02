package com.jachin.design.pattern11.jdk;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 11:02
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer1 observer1 = new Observer1();
        subject.addObserver(observer1);
        subject.setData("233");
    }
}
