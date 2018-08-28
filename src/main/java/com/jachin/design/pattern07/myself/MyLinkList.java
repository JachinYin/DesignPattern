package com.jachin.design.pattern07.myself;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/28 8:31
 */
public class MyLinkList implements Collection{
    private Node head = null;   // 链表首节点
    private int size = 0;       // 容器元素个数
    private Node tail = null;   // 链表尾节点
    @Override
    public void add(Object o) {
        Node node = new Node(o);
        if(head == null){
            head = node;
            tail = node;
            node.setNext(null);
        }else{
            tail.setNext(node);
            tail = node;
        }
        size ++;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new MyLinkListIterator();
    }

    private class MyLinkListIterator implements Iterator {

        private Node currentNode = head;

        @Override
        public Object next() {  // 返回当前节点数据，并将当前节点设置到下一个节点
            Node node = currentNode;
            currentNode = currentNode.getNext();
            return node.getObj();
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }
}
