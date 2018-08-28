package com.jachin.design.pattern05.reflect.handler;

import com.jachin.design.pattern05.reflect.Request;

public class Handler1 extends Handler{

    private int limit = 10;

    @Override
    public Request handle(Request req) {
        if(req.getDay()<limit){
            req.setInfo("Done at One");
            return req;
        }
        return getNext().handle(req);
    }
}
