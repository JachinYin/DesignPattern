package com.jachin.design.pattern05.standard.handler;

import com.jachin.design.pattern05.standard.Request;

public class HandlerOne extends Handler{
    @Override
    public String operation(Request req) {
        int limit = 2;
        if (req.day < limit)
            return req.info="Done at One";
        return next().operation(req);
    }
}
