package com.jachin.design.pattern10;

import java.util.HashMap;

/**
 * @des: 负责人，负责：保存备忘录，交还备忘录
 * @author: Jachin
 * @date: 2018/8/30 15:16
 */
public class Caretaker {
    private HashMap<String, IMemento> memento;

    public Caretaker() {
        this.memento = new HashMap<>();
    }

    public IMemento getMemento(String name) {
        return memento.get(name);
    }

    public void saveMementoTo(String name, IMemento m) {
        memento.put(name, m);
    }
}
