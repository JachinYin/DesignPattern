package com.jachin.design.pattern05.reflect.handler;

import com.jachin.design.pattern05.reflect.Request;

public class Handler3 extends Handler{

    private int limit = 30;

    @Override
    public Request handle(Request req) {
        if(req.getDay()<limit){
            req.setInfo("Done at Three");
            return req;
        }
        return getNext().handle(req);
    }
}
