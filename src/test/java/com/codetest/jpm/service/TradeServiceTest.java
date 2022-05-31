/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.codetest.jpm.service;

import com.codetest.jpm.models.Contract;
import com.codetest.jpm.models.Trade;
import com.codetest.jpm.storage.AssignedTradeStorage;
import com.codetest.jpm.storage.ContractStorage;
import com.codetest.jpm.storage.Storage;
import com.codetest.jpm.storage.TradeStorage;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author Uche Powers
 */
@RunWith(MockitoJUnitRunner.class)
public class TradeServiceTest {

    public TradeServiceTest() {
    }

    @Mock
    ContractStorage contractStorage = new ContractStorage(Storage.CONTRACT_STORAGE);
    @Mock
    TradeStorage tradeStorage = new TradeStorage(Storage.TRADE_STORAGE);
    private final AssignedTradeStorage assignedTradeStorage = new AssignedTradeStorage(Storage.ASSIGNED_TRADE_STORAGE);
    TradeService tradeService = new TradeService();
    

    /**
     * Test of runAssignContract method, of class TradeService.
     */
    @Test
    public void testRunAssignContract() {
        Mockito.when(tradeStorage.hasMoreElement()).thenReturn(true);
        
        Mockito.when(tradeStorage.getNextData()).thenReturn(Optional.of(new Trade(99, 2300)));
        Mockito.when(contractStorage.getNextData()).thenReturn(Optional.of(new Contract(99, "description")));
        
        
        tradeService.runAssignContract();

    }

    /**
     * Test of printAssignTrade method, of class TradeService.
     */
    @Test
    public void testPrintAssignedTrade() {

        assignedTradeStorage.add(99, new Trade(99, 4600, new Contract(9, "description")));

       // String printAssignedTrade = tradeService.printAssignedTrade();

    }

}
