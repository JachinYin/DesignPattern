package com.jachin.design.pattern18.object;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/4 16:24
 */
public class LeafFile extends Node {

    public LeafFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println(super.getName());
    }
}
