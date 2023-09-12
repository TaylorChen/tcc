package com.sun.demo.tpc.protocol.handler;

public interface Handler {
    String command();

    String handle(String data);
}
