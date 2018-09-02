package com.jachin.design.pattern12.standard;

import java.util.Random;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:15
 */
public class HasCoinState implements IState{
    private CandyMachine cm;
    public HasCoinState(CandyMachine cm){
        this.cm = cm;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already in, please turn the crank or return coin.");
    }

    @Override
    public void returnCoin() {
        System.out.println("Return coin success.");
        cm.setState(cm.getOnReadyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Please wait...");
        dispense();
    }

    @Override
    public void printState() {
        System.out.println("=== HasCoinState ===");
    }

    @Override
    public void dispense() {
        int luckyNum = new Random().nextInt(9);
//        System.out.println("lucky:"+luckyNum);
        if(luckyNum == 0 && cm.getCandyNum() > 1) {
            cm.setState(cm.getWinnerState());
            cm.TurnCrank();
        }else {
                cm.setState(cm.getSoldState());
                cm.TurnCrank();
        }
    }
}
