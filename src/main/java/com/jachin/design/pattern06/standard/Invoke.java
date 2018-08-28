package com.jachin.design.pattern06.standard;

/**
 * @des: 命令请求者
 * @author: Jachin
 * @date: 2018/8/28 17:38
 */
public class Invoke {
    ICommand command;

    public Invoke(ICommand command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
