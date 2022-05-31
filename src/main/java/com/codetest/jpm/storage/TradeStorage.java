/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.storage.abstractions.StorageAbstraction;
import com.codetest.jpm.models.Contract;
import com.codetest.jpm.models.Trade;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Uche Powers
 */
public class TradeStorage extends StorageAbstraction<Trade> {

    public TradeStorage(Map<Integer, Trade> TRADE_STORAGE) {
        super(TRADE_STORAGE);
    }

    @Override
    public boolean hasMoreElement() {
        return super.hasMoreElement();
    }

    public Optional<Trade> addContract(int tradeId, Contract contract) {
        if (idExist(tradeId)) {
            Trade trade = get(tradeId).get();
            trade.setContract(contract);
            trade.setSla(new Date());
            return modify(tradeId, trade);
        }
        return null;
    }

}
