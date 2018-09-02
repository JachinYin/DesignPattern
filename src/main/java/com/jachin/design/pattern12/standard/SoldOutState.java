package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:15
 */
public class SoldOutState implements IState{
    private CandyMachine cm;
    public SoldOutState(CandyMachine cm){
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

    }

    @Override
    public void printState() {
        System.out.println("=== SoldOutState ===");
    }

    @Override
    public void dispense() {

    }
}
