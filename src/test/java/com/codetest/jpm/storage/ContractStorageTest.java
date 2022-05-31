/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.models.Contract;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author Uche Powers
 */
public class ContractStorageTest {

    public ContractStorageTest() {
    }

    private ContractStorage contractStorage = new ContractStorage(Storage.CONTRACT_STORAGE);

    /**
     * Test of add method, of class ContractStorage.
     */
    @Test
    public void testAdd() {
        
        Optional<Contract> add = contractStorage.add(99, new Contract(99, "description"));

        Optional<Contract> contractOptional = contractStorage.get(99);

        assertEquals(contractOptional.isPresent(), true);

        Contract contract = contractOptional.get();

        assertEquals(contract.getDescription(), "description");
        assertEquals(contract.getId(), 99);
    }

    /**
     * Test of modify method, of class ContractStorage.
     */
    @Test
    public void testModify() {

        //Mockito.when(contractStorage.idExist(99)).thenReturn(true);
        //add the the storage
        contractStorage.add(99, new Contract(99, "description"));

        //modify the data added
        contractStorage.modify(99, new Contract(99, "description modified"));

        //get modified Object
        Optional<Contract> contractOptional = contractStorage.get(99);

        assertEquals(contractOptional.isPresent(), true);

        Contract contract = contractOptional.get();

        assertEquals(contract.getDescription(), "description modified");
        assertEquals(contract.getId(), 99);

    }

    /**
     * Test of get method, of class ContractStorage.
     */
    @Test
    public void testGet() {
        //add data
        contractStorage.add(99, new Contract(99, "description"));

        //get data
        Optional<Contract> contractOptional = contractStorage.get(99);
        
        assertEquals(contractOptional.isPresent(), true);

        Contract contract = contractOptional.get();

        //assert that all data from object are equal
        assertEquals(contract.getDescription(), "description");
        assertEquals(contract.getId(), 99);

    }

    /**
     * Test of idExist method, of class ContractStorage.
     */
    @Test
    public void testIdExist() {
        //add data
        contractStorage.add(99, new Contract(99, "description"));

        //assert that data has been removed
        assertEquals(contractStorage.idExist(99), true);

    }

    /**
     * Test of remove method, of class ContractStorage.
     */
    @Test
    public void testRemove() {

        //add data
        contractStorage.add(99, new Contract(99, "description"));

        //remove data
        contractStorage.remove(99);

        //asert that the data has been removed
        assertEquals(contractStorage.idExist(99), false);
    }

}
