package com.jachin.design.pattern03.weak;

public class Director {
    private IBuild iBuild;
    public Director(IBuild iBuild){
        this.iBuild = iBuild;
    }
    public Product build(){
        return iBuild.create();
    }

    public static void main(String[] args) {
        Product p = new Director(new BuildProduct()).build();
        Product p2 = new Director(new BuildProduct2()).build();
    }
}
