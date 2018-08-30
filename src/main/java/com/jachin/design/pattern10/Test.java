package com.jachin.design.pattern10;

/**
 * @des:
 * @author: Jachin
 * @date: 2018/8/30 15:15
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // state1
        System.out.println("state1:");
        originator.getMemento().put("player","player1目前的状态");
        originator.getMemento().put("world","Nether");
        originator.showState();
        System.out.println("state1 saved...\n");
        caretaker.saveMementoTo("1",originator.createMemento());

        // state2
        System.out.println("state2:");
        originator.getMemento().put("player","player1目前的状态");
        originator.getMemento().put("world","overWorld");
        originator.showState();
        System.out.println("state2 saved...\n");
        caretaker.saveMementoTo("2",originator.createMemento());

        System.out.println("==============");
        System.out.println("state1 load...");
        originator.restoreMemento(caretaker.getMemento("1"));
        originator.showState();
    }
}
