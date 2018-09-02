package com.jachin.design.pattern14;

/**
 * @des: 抽象打印机，定义了打印流程的框架：
 * 打印报头
 * 打印主体
 * 打印尾部
 * 具体的三个打印部分的需要做些什么交给具体的打印机完成
 * @author: Jachin
 * @date: 2018/9/1 23:40
 */
public abstract class Printer {
    public void print(){
        printHead();
        printBody();
        printTail();
    }
    // 打印报头
    public void printHead(){}
    // 打印主体
    public void printBody(){}
    // 打印尾部
    public void printTail(){}
}
