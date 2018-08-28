package com.jachin.design.pattern05.standard.handler;

import com.jachin.design.pattern05.standard.Request;

public class HandlerThree extends Handler{
    @Override
    public String operation(Request req) {
        int limit = 30;
        if (req.day < limit)
            return req.info = "Done at Three";
        return next().operation(req);
    }
}
