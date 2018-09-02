package com.jachin.design.pattern15.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/2 11:47
 */
public class Test {

    private static void test1(){
        Context ctx = new Context();
        ctx.assign("a",10);
        ctx.assign("b",81);
        ctx.assign("c",17);
        // 求 a + b - c 的值
        double result = new MinusExpression(
                new PlusExpression(new NumberExpression("a")
                        ,new NumberExpression("b"))
                ,new NumberExpression("c")
        ).interpret(ctx);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Test.test1();
    }
}
