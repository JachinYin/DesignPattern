package com.jachin.design.pattern17.mo;

import java.awt.event.WindowEvent;

/**
 * @des: 默认适配器，让继承其的子类选择自己想要的功能进行实现
 * @author: Jachin
 * @date: 2018/9/3 18:49
 */
public abstract class WindowAdapter implements WindowListener{
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}
}
