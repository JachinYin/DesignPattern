package com.jachin.design.pattern03.weak;

public class BuildProduct2 implements IBuild {
    private Product product;
    public void createUnit01() {
        product.unit01 = null;
    }
    public void createUnit02() {
        product.unit02 = null;
    }

    public Product composite() {
        // ... 关联 unit01,02
        return product;
    }

    @Override
    public Product create() {
        createUnit01();
        createUnit02();
        return composite();
    }
}
