package com.jachin.design.pattern15.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 11:53
 */
public class NumberExpression implements Expression{
    private String key;

    public NumberExpression(String key) {
        this.key = key;
    }

    @Override
    public double interpret(Context ctx) {
        return ctx.map.get(key);
    }
}
