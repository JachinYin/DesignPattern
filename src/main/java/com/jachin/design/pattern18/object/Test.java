package com.jachin.design.pattern18.object;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/3 18:34
 */
public class Test {

    private static void createTree(Node node) throws Exception {
        LeafFile leafFile = new LeafFile("file01.txt");
        LeafFile leafFile2 = new LeafFile("file02.txt");
        LeafFile leafFile3 = new LeafFile("file03.txt");
        LeafDirect txt = new LeafDirect("txt");
        txt.add(leafFile);
        txt.add(leafFile2);
        txt.add(leafFile3);
        node.add(new LeafFile("list.txt"));
        node.add(txt);
    }

    public static void main(String[] args) throws Exception {
        LeafDirect myFile = new LeafDirect("myFile");
        Test.createTree(myFile);
        myFile.display();
    }
}
