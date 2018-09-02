package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 21:37
 */
public class Test {
    public static void main(String[] args) {
        CandyMachine cm = new CandyMachine();
        cm.addCandy(3);
        cm.PrintState();
        cm.InsertCoin();

        cm.PrintState();
        cm.TurnCrank();

        cm.PrintState();
    }
}
