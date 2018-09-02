package com.jachin.design.pattern13.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/1 16:03
 */
public class Context {
    private IStrategy is;
    public Context(IStrategy is){
        this.is = is;
    }
    public int cal(int a, int b){
        return is.cal(a, b);
    }
}
