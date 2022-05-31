/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.models.Contract;
import com.codetest.jpm.models.Trade;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Uche Powers
 */
public class Storage {

    //storage of trade data
    public static final Map<Integer, Trade> TRADE_STORAGE = Collections.synchronizedMap(new HashMap<>());
    //storage contains trades that have contract
    public static final Map<Integer, Trade> ASSIGNED_TRADE_STORAGE = Collections.synchronizedMap(new HashMap<>());
    //storage for contract
    public static final Map<Integer, Contract> CONTRACT_STORAGE = Collections.synchronizedMap(new HashMap<>());

    //seeding trade data
    static {
        TRADE_STORAGE.put(1, new Trade(1, 500));
        TRADE_STORAGE.put(2, new Trade(2, 900));
        TRADE_STORAGE.put(3, new Trade(3, 2000));
        TRADE_STORAGE.put(4, new Trade(4, 5900));
        TRADE_STORAGE.put(5, new Trade(5, 2200));
    }

    //seeding ccontract data
    static {
        CONTRACT_STORAGE.put(1, new Contract(1, "First Contract"));
        CONTRACT_STORAGE.put(2, new Contract(2, "Second Contract"));
        CONTRACT_STORAGE.put(3, new Contract(3, "Third Contract"));
        CONTRACT_STORAGE.put(4, new Contract(4, "Fourth Contract"));
        CONTRACT_STORAGE.put(5, new Contract(5, "Fifth Contract"));
    }

}
