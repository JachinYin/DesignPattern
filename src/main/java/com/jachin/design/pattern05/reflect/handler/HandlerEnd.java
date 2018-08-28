package com.jachin.design.pattern05.reflect.handler;

import com.jachin.design.pattern05.reflect.Request;

public class HandlerEnd extends Handler{

    @Override
    public Request handle(Request req) {
        req.setInfo("None Node handles this request!");
        return req;
    }
}
