package com.jachin.design.pattern14;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/1 16:59
 */
public class Test {
    public static void main(String[] args) {
        Printer onePrinter = new OnePrinter();
        Printer twoPrinter = new TwoPrinter();
        onePrinter.print();
        twoPrinter.print();
    }
}
