package com.jachin.design.pattern03.weak;

public class BuildProduct implements IBuild {
    private Product product;
    public void createUnit01() {
        product.unit01 = null;
    }
    public void createUnit02() {
        product.unit02 = null;
    }
    public void createUnit03() {
        product.unit03 = null;
    }

    public Product composite() {
        // ... 关联 unit01,02,03
        createUnit01();
        createUnit02();
        createUnit03();
        return product;
    }

    @Override
    public Product create() {
        return composite();
    }
}
