package com.jachin.design.pattern10;

import java.util.HashMap;

/**
 * @des: 原发者，负责出创建备忘录和恢复使用备忘录恢复
 * @author: Jachin
 * @date: 2018/8/30 15:17
 */
public class Originator {
    private HashMap<String,Object> state;

    public Originator() {
        this.state = new HashMap<>();
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(IMemento m){
        state = ((Memento) m).getMemento();
    }

    public void showState(){
        System.out.println(state);
    }

    public HashMap<String, Object> getMemento(){
        return state;
    }

    /**
     * @des: 备忘录，负责存储原发者的状态
     */
    private class Memento implements IMemento{
        private HashMap<String, Object> memento;    // 备忘录记录了具体的对象内部数据
        public Memento(HashMap<String, Object> memento) {
            this.memento = new HashMap<>(memento); // 这里必须选择深拷贝
        }

        public HashMap<String, Object> getMemento() {
            return memento;
        }

        public void setMemento(HashMap<String, Object> memento) {
            this.memento = memento;
        }

    }
}
