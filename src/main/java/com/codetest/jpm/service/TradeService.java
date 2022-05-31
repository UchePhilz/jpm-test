/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.service;

import com.codetest.jpm.models.Contract;
import com.codetest.jpm.models.Trade;
import com.codetest.jpm.storage.AssignedTradeStorage;
import com.codetest.jpm.storage.ContractStorage;
import com.codetest.jpm.storage.Storage;
import com.codetest.jpm.storage.TradeStorage;
import java.util.Date;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Uche Powers
 */
public class TradeService {

    private final TradeStorage tradeStorage = new TradeStorage(Storage.TRADE_STORAGE);
    private final AssignedTradeStorage assignedTradeStorage = new AssignedTradeStorage(Storage.ASSIGNED_TRADE_STORAGE);
    private final ContractStorage contractStorage = new ContractStorage(Storage.CONTRACT_STORAGE);
    private final Timer t = new Timer();

    public void addAssignContract() {
        if (tradeStorage.hasMoreElement()) {
            Optional<Trade> nextTrade = tradeStorage.getNextData();
            Optional<Contract> nextContract = contractStorage.getNextData();

            if (nextContract.isPresent() || nextTrade.isPresent()) {

                Trade trade = nextTrade.get();
                trade.setSla(new Date());
                Contract contract = nextContract.get();
                trade.setContract(contract);

                assignedTradeStorage.add(trade.getId(), trade);
                tradeStorage.remove(trade.getId());
            }
        } else {
            t.cancel();
            printAssignedTrade();
        }
    }

    //
    public void runAssignContract() {

        //TradeContractScheduler tradeScheduler = new TradeContractScheduler("");
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                addAssignContract();
            }
        }, 0, 2 * 1000);
    }

    public String printAssignedTrade() {
        String res = assignedTradeStorage.printData();
        System.out.println(res);
        return res;
    }

}
