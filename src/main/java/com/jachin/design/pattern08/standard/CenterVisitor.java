package com.jachin.design.pattern08.standard;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/28 22:07
 */
class Point{
    float x,y;
}

public class CenterVisitor implements IVisitor<Square>{
    @Override
    public Object visit(Square s) {
        Point p = new Point();
        p.x = s.weight / 2;
        p.y = s.height / 2;
        System.out.println("功能：求重心");
        return p;
    }
}
