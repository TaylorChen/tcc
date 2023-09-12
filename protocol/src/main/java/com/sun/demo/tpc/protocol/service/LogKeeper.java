package com.sun.demo.tpc.protocol.service;

import com.sun.demo.tpc.protocol.domian.DistributedTransaction;
import com.sun.demo.tpc.protocol.domian.TransactionStatus;

/**
 * 日志监听
 */
public interface LogKeeper {

    /**
     * 记录消息
     * @param transaction
     * @param status
     */
    void recordMsg(DistributedTransaction transaction, TransactionStatus status);
}
