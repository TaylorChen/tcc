package com.sun.demo.tpc.bocserver.conf;

import com.sun.demo.tpc.bankcommon.domain.BankingParticipant;
import com.sun.demo.tpc.protocol.conf.TransactionManagerNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class BocConfiguration {

    @Bean
    public TransactionManagerNode transactionManagerNode() {
        try {
            return new TransactionManagerNode("transactionManager", new URL("http", "127.0.0.1", 8000, "/api"));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Bean
    public BankingParticipant bankingParticipant() {
        try {
            return new BankingParticipant("BOC", new URL("http", "127.0.0.1", 8001, "/api"));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
