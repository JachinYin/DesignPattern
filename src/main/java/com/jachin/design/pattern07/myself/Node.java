package com.jachin.design.pattern07.myself;

/**
 * @des: 节点
 * @author: Jachin
 * @date: 2018/8/28 8:30
 */
public class Node {
    private Object obj;     // 当前节点
    private Node next;      // 下一个节点

    public Node(Object o) {
        this.obj = o;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
