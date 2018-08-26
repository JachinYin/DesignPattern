package com.jachin.design.pattern02.factory;

/**
 * 创建具体特征的工厂
 */
public class UpFactory extends AbstractFactory {
    @Override
    public ICar create() {
        return new UpCar();
    }
}
