package com.sun.demo.tpc.bankcommon.service;

import com.sun.demo.tpc.protocol.domian.DistributedTransaction;
import com.sun.demo.tpc.protocol.domian.LogRecord;
import com.sun.demo.tpc.protocol.service.AbstractLogKeeper;
import com.sun.demo.tpc.protocol.service.LogRecordService;
import com.sun.demo.tpc.protocol.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankLogKeeper extends AbstractLogKeeper {
    @Autowired
    private LogRecordService logRecordService;
    @Autowired
    private TransactionService transactionService;

    @Override
    public void saveOrUpdate(LogRecord logRecord) {
        logRecordService.saveOrUpdate(logRecord);
    }

    @Override
    public void saveOrUpdate(DistributedTransaction distributedTransaction) {
        transactionService.saveOrUpdate(distributedTransaction);
    }

    @Override
    public List<LogRecord> findUndecidedTransactions() {
        return logRecordService.findUndecidedTransactions();
    }

    @Override
    public DistributedTransaction findTranactionById(String Id) {
        return transactionService.findTranactionById(Id);
    }

    @Override
    public List<DistributedTransaction> findTranactionByIds(List<String> Id) {
        return transactionService.findTranactionByIds(Id);
    }
}
