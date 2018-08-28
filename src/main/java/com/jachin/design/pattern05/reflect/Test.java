package com.jachin.design.pattern05.reflect;

/**
 * @des: 测试类
 * @author: Jachin
 * @date: 2018/8/27 15:45
 */
public class Test {

    public static void main(String[] args) {
        //　新建节点链对象，并通过调用 create 方法构建节点链
        Chain chain = new Chain();
        chain.createChain();
        // 传递并处理请求
        Request r = chain.handle(new Request(280));
        System.out.println(r.getInfo());
    }
}
