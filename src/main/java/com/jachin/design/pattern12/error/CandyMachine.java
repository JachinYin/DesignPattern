package com.jachin.design.pattern12.error;

/**
 * @des: 一个简单的糖果机，有四种状态：售罄、待机、已投币、出货，该机器有三个功能：投币、退币、转动把手
 * 在售罄状态下，进行任何操作都不能改变机器的状态；
 * 待机状态可以投币进入已投币状态；
 * 已投币状态下可以退币进入待机状态，可以摇动把手进入出货状态
 * 出货状态下不能进行任何操作，只能等待机器完成出货，并根据货物剩余判断进入待机状态或者售罄状态
 *
 * =======
 * 以上是糖果机的原设计，现在要求，为糖果机添加游戏元素，每次转动把手都有 10% 概率得到双倍糖果！
 * 很明显，需要修改每一种状态，工作量巨大，并且违反了开放封闭原则(对新增开放，对修改关闭)
 * 而状态模式可以很好地解决这种问题
 * @author: Jachin
 * @date: 2018/8/31 16:48
 */
public class CandyMachine {

    private int state;
    private int candyNum;

    private final int SoldOut = 0;
    private final int OnReady = 1;
    private final int HasCoin = 2;
    private final int Sold = 3;

    public CandyMachine(int candyNum){
        this.candyNum = candyNum;
        if(candyNum > 0)
            state = OnReady;
    }

    public void insertCoin(){
        System.out.println("您投入了一枚硬币。");
        switch (state){
            case SoldOut:
                System.out.println("系统提示：糖果已售罄！");
                break;
            case OnReady:
                System.out.println("系统提示：投币成功！");
                state = HasCoin;
                break;
            case HasCoin:
                System.out.println("系统提示：您已经投过币。");
                break;
            case Sold:
                System.out.println("系统提示：正在出货，无法投币");
                break;
        }
    }

    public void returnCoin(){
        System.out.println("您选择了退币。");
        switch (state){
            case SoldOut:
                System.out.println("系统提示：糖果已售罄！");
                System.out.println("系统提示：币已退还。");
                break;
            case OnReady:
                System.out.println("系统提示：无币可退。");
                break;
            case HasCoin:
                System.out.println("系统提示：退币成功！");
                state = OnReady;
                break;
            case Sold:
                System.out.println("系统提示：正在出货，无法退币！");
                break;
        }
    }

    public void turnCrank(){
        System.out.println("您转动了把手。");
        switch (state){
            case SoldOut:
                System.out.println("系统提示：糖果已售罄！");
                break;
            case OnReady:
                System.out.println("系统提示：请投币。");
                break;
            case HasCoin:
                System.out.println("系统提示：正在出货，请稍等...");
                state = Sold;
                dispense();
                break;
            case Sold:
                System.out.println("系统提示：正在出货，不必重复转动");
                dispense();
                break;
        }
    }

    public void printState(){
        switch (state){
            case SoldOut:
                System.out.println("=== MachineTurnOff ===");
                break;
            case OnReady:
                System.out.println("=== OnReady ===");
                break;
            case HasCoin:
                System.out.println("=== HasCoin ===");
                break;
            case Sold:
                System.out.println("=== Sold ===");
                break;
        }
    }

    private void dispense(){
        if(candyNum > 0){
            candyNum--;
            System.out.println("Candy Out....");
            if(candyNum > 0)
                state = OnReady;
            else
                state = SoldOut;
        }
    }
}
