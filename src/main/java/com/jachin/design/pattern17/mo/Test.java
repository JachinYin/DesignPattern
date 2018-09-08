package com.jachin.design.pattern17.mo;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/9/3 18:45
 */
public class Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Window");
        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { // 只选择了其中一个功能
                System.exit(0);
            }
        });
        jf.setSize(500,200);
        jf.setLocation(500,500);
        jf.setVisible(true);
    }
}
