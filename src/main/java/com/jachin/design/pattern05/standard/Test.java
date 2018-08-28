package com.jachin.design.pattern05.standard;

public class Test {
    public static void main(String[] args) {
        Request request = new Request(1);
        Request request2 = new Request(3);
        Request request3 = new Request(24);
        Client client = new Client();
        client.create();
        System.out.println(client.handle(request));
        System.out.println(client.handle(request2));
        System.out.println(client.handle(request3));
    }
}
