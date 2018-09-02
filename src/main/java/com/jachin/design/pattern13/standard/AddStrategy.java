package com.jachin.design.pattern13.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/1 16:02
 */
public class AddStrategy implements IStrategy{
    @Override
    public int cal(int a, int b) {
        return a + b;
    }
}
