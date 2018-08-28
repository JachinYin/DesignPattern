package com.jachin.design.pattern07.myself;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/27 20:46
 */
public class Test {
    public static void main(String[] args) {
        Collection myArrayList = new MyArrayList(8);
        for (int i = 0; i < 20 ; i++){
            myArrayList.add(i+1);
        }
        Iterator iterator = myArrayList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Collection myLinkList = new MyLinkList();
        for (int i = 0; i < 20; i++){
            myLinkList.add("pea "+i);
        }
        Iterator iterator1 = myLinkList.iterator();
        while (iterator1.hasNext())
            System.out.println(iterator1.next());
    }
}
