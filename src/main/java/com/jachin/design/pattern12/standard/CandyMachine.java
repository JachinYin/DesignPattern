package com.jachin.design.pattern12.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/31 22:17
 */
public class CandyMachine {

    private int candyNum;

    private IState state;
    private IState soldOutState;
    private IState onReadyState;
    private IState hasCoinState;
    private IState soldState;
    private IState winnerState;

    public void addCandy(int num){
        if (num < 0) return;
        candyNum += num;
        if (candyNum > 0)
            state = onReadyState;
        else state = soldOutState;
    }

    public CandyMachine() {
        soldOutState = new SoldOutState(this);
        onReadyState = new OnReadyState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
    }

    public void InsertCoin(){
        state.insertCoin();
    }

    public void ReturnCoin(){
        state.returnCoin();
    }

    public void TurnCrank(){
        state.turnCrank();
    }

    public void PrintState(){
        state.printState();
//        System.out.println(state);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public IState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(IState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public IState getOnReadyState() {
        return onReadyState;
    }

    public void setOnReadyState(IState onReadyState) {
        this.onReadyState = onReadyState;
    }

    public IState getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(IState hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public IState getSoldState() {
        return soldState;
    }

    public void setSoldState(IState soldState) {
        this.soldState = soldState;
    }

    public IState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(IState winnerState) {
        this.winnerState = winnerState;
    }

    public int getCandyNum() {
        return candyNum;
    }

    public void setCandyNum(int candyNum) {
        this.candyNum = candyNum;
    }
}
