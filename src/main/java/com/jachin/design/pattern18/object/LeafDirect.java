package com.jachin.design.pattern18.object;

import java.util.ArrayList;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/4 16:29
 */
public class LeafDirect extends Node {
    private ArrayList<Node> nodes = new ArrayList<>();

    public LeafDirect(String name) {
        super(name);
    }
    @Override
    public void add(Node node){
        nodes.add(node);
    }

    @Override
    public void display() {
        System.out.println(super.getName());
        for(Node n : nodes){
            n.display();
        }
    }
}
