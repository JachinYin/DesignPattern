package com.jachin.design.pattern08.standard;

/**
 * @des: 测试类
 * @author: Jachin
 * @date: 2018/8/28 22:08
 */
public class Test {
    public static void main(String[] args) {
        // 重心功能访问者
        IVisitor v = new CenterVisitor();
        // 外圆功能访问者
        IVisitor v2 = new CircleVisitor();
        Square s = new Square(2,5);
        Point p = (Point) s.accept(v);
        System.out.println("\tx="+ p.x + ",y=" +p.y);

        Circle circle = (Circle) s.accept(v2);
        System.out.println("\t"+circle.info);
    }
}
