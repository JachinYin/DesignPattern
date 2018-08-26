package com.jachin.design.pattern02.abstractfactory;

/**
 * 创建具体特征的工厂
 */
public class UpFactory extends AbstractFactory {
    @Override
    public ICar createCar() {
        return new UpCar();
    }

    @Override
    public IBus createBus() {
        return new UpBus();
    }
}
