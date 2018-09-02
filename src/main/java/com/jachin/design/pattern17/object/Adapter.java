package com.jachin.design.pattern17.object;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 21:00
 */
public class Adapter {
    private ThirdCompany third;

    public Adapter() {
        third = new ThirdCompany();
    }

    public int addCalc(int a, int b){
        return third.addCalc(a,b);
    }
}
