package com.jachin.design.pattern13.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/1 16:01
 */
public class Test {
    public static void main(String[] args) {
        IStrategy is = new AddStrategy();
        Context context = new Context(is);
        System.out.println(context.cal(1, 2));
    }
}
