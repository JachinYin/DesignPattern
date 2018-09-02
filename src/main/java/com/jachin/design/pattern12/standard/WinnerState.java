package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:15
 */
public class WinnerState implements IState{

    private CandyMachine cm;
    public WinnerState(CandyMachine cm){
        this.cm = cm;
    }

    @Override
    public void insertCoin() {
    }

    @Override
    public void returnCoin() {
    }

    @Override
    public void turnCrank() {
        System.out.println("You won, another candy!");
        dispense();
    }

    @Override
    public void printState() {
        System.out.println("=== WinnerState ===");
    }

    @Override
    public void dispense() {
        System.out.println("*Another candy out.");
        cm.setCandyNum(cm.getCandyNum() - 1);
        if (cm.getCandyNum() > 0){
            cm.setState(cm.getOnReadyState());
        }else
            cm.setState(cm.getSoldOutState());
    }
}
