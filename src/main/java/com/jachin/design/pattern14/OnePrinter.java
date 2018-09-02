package com.jachin.design.pattern14;

/**
 * @des: One 牌打印机
 * @author: Jachin
 * @date: 2018/9/1 23:43
 */
public class OnePrinter extends Printer {

    @Override
    public void printHead() {
        System.out.println("OnePrinter Working:Print Head");
    }

    @Override
    public void printBody() {
        System.out.println("OnePrinter Working:Print Body");
    }

    @Override
    public void printTail() {
        System.out.println("OnePrinter Working:Print Tail");
    }
}
