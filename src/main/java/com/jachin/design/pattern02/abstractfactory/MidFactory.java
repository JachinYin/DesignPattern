package com.jachin.design.pattern02.abstractfactory;

/**
 * 创建具体特征的工厂
 */
public class MidFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new MidCar();
    }

    @Override
    public IBus createBus() {
        return null;
    }
}
