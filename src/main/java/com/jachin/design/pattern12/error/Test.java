package com.jachin.design.pattern12.error;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 16:48
 */
public class Test {
    public static void main(String[] args) {
        CandyMachine cm = new CandyMachine(1);
        cm.printState();
        cm.insertCoin();

        cm.printState();
        cm.turnCrank();

        cm.printState();
        cm.insertCoin();

        cm.printState();
        cm.turnCrank();

        cm.printState();
        cm.returnCoin();
    }
}
