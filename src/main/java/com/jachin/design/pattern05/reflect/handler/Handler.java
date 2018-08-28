package com.jachin.design.pattern05.reflect.handler;

import com.jachin.design.pattern05.reflect.Request;

public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract Request handle(Request req);
}
