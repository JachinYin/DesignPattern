package com.jachin.design.pattern17.mo;

import java.awt.event.WindowEvent;
import java.util.EventListener;

// 定义需要实现功能的接口
public interface WindowListener extends EventListener {
    public void windowActivated(WindowEvent e);
    public void windowClosed(WindowEvent e);
    public void windowClosing(WindowEvent e);
    public void windowDeactivated(WindowEvent e);
    public void windowDeconified(WindowEvent e);
    public void windowIconified(WindowEvent e);
    public void windowOpened(WindowEvent e);
}
