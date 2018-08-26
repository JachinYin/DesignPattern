package com.jachin.design.pattern03.standard;

public class BuildProduct implements IBuild{

    private Product product;

    @Override
    public void createUnit01() {
        product.unit01 = null;
    }

    @Override
    public void createUnit02() {
        product.unit02 = null;
    }

    @Override
    public void createUnit03() {
        product.unit03 = null;
    }

    @Override
    public Product composite() {
        // ... 关联 unit01,02,03
        return product;
    }
}
