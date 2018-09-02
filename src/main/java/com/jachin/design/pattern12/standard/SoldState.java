package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:15
 */
public class SoldState implements IState{
    private CandyMachine cm;
    public SoldState(CandyMachine cm){
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
        System.out.println("*Candy out.");
        dispense();
    }

    @Override
    public void printState() {
        System.out.println("=== SoldState ===");
    }

    @Override
    public void dispense() {
        cm.setCandyNum(cm.getCandyNum() -1);
        if(cm.getCandyNum()>0)
            cm.setState(cm.getOnReadyState());
        else
            cm.setState(cm.getSoldOutState());
    }
}
