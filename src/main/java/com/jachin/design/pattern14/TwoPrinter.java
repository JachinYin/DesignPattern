package com.jachin.design.pattern14;

/**
 * @des: Two 牌打印机
 * @author: Jachin
 * @date: 2018/9/1 23:43
 */
public class TwoPrinter extends Printer {

    @Override
    public void printHead() {
        System.out.println("TwoPrinter Working:Print Head");
    }

    @Override
    public void printBody() {
        System.out.println("TwoPrinter Working:Print Body");
    }

    @Override
    public void printTail() {
        System.out.println("TwoPrinter Working:Print Tail");
    }
}
