package com.jachin.design.pattern05.standard.handler;

import com.jachin.design.pattern05.standard.Request;

public abstract class Handler {
    private Handler next;
    public void setNext(Handler next){
        this.next = next;
    }
    public Handler next(){
        return next;
    }
    public abstract String operation(Request req);
}
