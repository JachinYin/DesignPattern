package com.jachin.design.pattern07.myself;

import java.util.Arrays;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/27 20:30
 */
public class MyArrayList implements Collection{
    private Object[] elementsData;
    private int size;

    public MyArrayList(int size){
        elementsData = new Object[size];
        this.size = 0;
    }

    @Override
    public void add(Object o) {
        if(size == elementsData.length){
            int newSize = size * 2;
            elementsData = Arrays.copyOf(elementsData, newSize);
        }
        elementsData[size++] = o;
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public int size() {
        return size;
    }

    public Object get(int index){
        return elementsData[index];
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {
        private int currentIndex = 0;
        @Override
        public Object next() {
            Object o = elementsData[currentIndex];
            currentIndex ++;
            return o;
        }

        @Override
        public boolean hasNext() {
            return size > currentIndex;
        }
    }
}
