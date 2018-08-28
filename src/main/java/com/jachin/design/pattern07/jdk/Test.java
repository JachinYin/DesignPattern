package com.jachin.design.pattern07.jdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * @des: JDK 容器类原生的迭代器，可以屏蔽容器间的差异，实现简单方便的遍历
 * @author: Jachin
 * @date: 2018/8/27 20:01
 */
public class Test {

    public static void traverse(Collection<String> c){
        Iterator<String> it = c.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("gh");
        vector.add("os");
        vector.add("tt");
        Test.traverse(vector);

        ArrayList<String> list = new ArrayList<>();
        list.add("Ja");
        list.add("ch");
        list.add("in");
        Test.traverse(list);
    }
}
