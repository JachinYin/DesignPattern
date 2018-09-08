package com.jachin.design.pattern18.object;

public abstract class Node {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Node(String name) {
        this.name = name;
    }

    public void add(Node node) throws Exception {
        throw new Exception("Invalid Node.");
    }
    public void remove(Node node){}
    public void display(){}
}
