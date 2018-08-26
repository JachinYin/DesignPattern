package com.jachin.design.pattern03.standard;

public class Director {
    private IBuild iBuild;
    public Director(IBuild iBuild){
        this.iBuild = iBuild;
    }
    public Product build(){
        iBuild.createUnit01();
        iBuild.createUnit02();
        iBuild.createUnit03();
        return iBuild.composite();
    }

    public static void main(String[] args) {
        Product p = new Director(new BuildProduct()).build();
        Product p2 = new Director(new BuildProduct2()).build();
    }
}
