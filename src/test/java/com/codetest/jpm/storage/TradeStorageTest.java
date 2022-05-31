/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.models.Contract;
import com.codetest.jpm.models.Trade;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Uche Powers
 */
public class TradeStorageTest {

    public TradeStorageTest() {
    }

    private ContractStorage contractStorage = new ContractStorage(Storage.CONTRACT_STORAGE);
    private TradeStorage tradeStorage = new TradeStorage(Storage.TRADE_STORAGE);

    /**
     * Test of addContract method, of class TradeStorage.
     */
    @Test
    public void testAddContract() {

        contractStorage.add(99, new Contract(99, "description"));
        tradeStorage.add(99, new Trade(99, 2300));

        Optional<Contract> contractOptional = contractStorage.get(99);
        Optional<Trade> tradeOptional = tradeStorage.get(99);
        
        assertEquals(contractOptional.isPresent(), true);
        assertEquals(tradeOptional.isPresent(), true);

        tradeStorage.addContract(99, contractOptional.get());

        Optional<Trade> optionalTrade = tradeStorage.get(99);

        Trade trade = optionalTrade.get();
        Contract contract = trade.getContract();
        
        
        
        assertEquals(trade.getId(), 99);
        assertEquals(trade.getValue(), 2300);
        
        assertNotNull(trade.getSla());
        
        assertEquals(contract.getId(), 99);
        assertEquals(contract.getDescription(), "description");

    }

}
