package com.sun.demo.tpc.protocol.util;

import java.util.UUID;

public class TransactionIdGenerator {

    public static String getTransactionId() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
