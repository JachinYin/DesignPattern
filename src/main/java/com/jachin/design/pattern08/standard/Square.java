package com.jachin.design.pattern08.standard;

/**
 * @des: 方形 具体功能类
 * @author: Jachin
 * @date: 2018/8/28 22:01
 */
public class Square implements IShape{
    public float weight;
    public float height;

    public Square(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public float getLength() {
        return (weight + height) * 2;
    }

    @Override
    public float getArea() {
        return weight * height;
    }

    @Override
    public Object accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
