package com.jachin.design.pattern06.standard;

/**
 * @des: 命令发送者
 * @author: Jachin
 * @date: 2018/8/28 17:35
 */
public class Teacher implements ICommand{
    private Student receiver = null;

    public Teacher(Student stu){
        this.receiver = stu;
    }

    @Override
    public void execute() {
        receiver.sweep();
        receiver.homework();
    }
}
