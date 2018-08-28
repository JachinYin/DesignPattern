package com.jachin.design.pattern05.standard;

import com.jachin.design.pattern05.standard.handler.Handler;
import com.jachin.design.pattern05.standard.handler.HandlerOne;
import com.jachin.design.pattern05.standard.handler.HandlerThree;
import com.jachin.design.pattern05.standard.handler.HandlerTwo;

public class Client {
    private Handler one = new HandlerOne();
    private Handler two = new HandlerTwo();
    private Handler three = new HandlerThree();
    public void create(){
        one.setNext(two);
        two.setNext(three);
    }
    public String handle(Request request){
        return one.operation(request);
    }
}
