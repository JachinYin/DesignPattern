package com.jachin.design.pattern15.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 11:56
 */
public class MinusExpression implements Expression{
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret(Context ctx) {
        return left.interpret(ctx) - right.interpret(ctx);
    }
}
