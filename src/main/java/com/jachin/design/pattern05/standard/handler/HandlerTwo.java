package com.jachin.design.pattern05.standard.handler;

import com.jachin.design.pattern05.standard.Request;

public class HandlerTwo extends Handler{
    @Override
    public String operation(Request req) {
        int limit = 7;
        if (req.day < limit)
            return req.info = "Done at Two";
        return next().operation(req);
    }
}
