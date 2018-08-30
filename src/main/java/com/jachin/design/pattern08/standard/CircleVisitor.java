package com.jachin.design.pattern08.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/29 8:47
 */
public class CircleVisitor implements IVisitor<Square>{
    @Override
    public Object visit(Square s) {
        System.out.println("功能：求外圆");
        Circle circle = new Circle("Circle");
        return circle;
    }
}

class Circle{
    public String info;
    public Circle(String info) {
        this.info = info;
    }
}