package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:15
 */
public class OnReadyState implements IState{
    private CandyMachine cm;
    public  OnReadyState(CandyMachine cm){
        this.cm = cm;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin in,please turn the crank or return coin.");
        cm.setState(cm.getHasCoinState());
    }

    @Override
    public void returnCoin() {
        System.out.println("None coin can return.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please insert Coin.");
    }

    @Override
    public void printState() {
        System.out.println("=== OnReadyState ===");
    }

    @Override
    public void dispense() {
    }
}
