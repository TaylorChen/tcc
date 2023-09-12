package com.sun.demo.tpc.protocol.service;

import com.sun.demo.tpc.protocol.domian.*;

public interface MessageSender {

    TransReqResult sendTransactionRequest2Coordinator(final Node node, DistributedTransaction transaction);

    VoteResult sendVoteRequest2Participant(final Node node, DistributedTransaction transaction);

    void sendDecision2Participant(final Node node, DecisionMessage message);

    DecisionQueryResult sendDecisionQuery2Others(final Node node, DecisionQueryMessage message);
}
