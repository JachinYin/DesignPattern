package com.jachin.design.pattern17.classes;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/3 18:38
 */
public class Adapter extends ThirdCompany implements IMath{
    @Override
    public int add(int a, int b) {
        return addCalc(a, b);
    }
}
