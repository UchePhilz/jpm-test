/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.storage.abstractions.StorageAbstraction;
import com.codetest.jpm.models.Contract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Uche Powers
 */
public class ContractStorage extends StorageAbstraction<Contract> {

    public ContractStorage(Map<Integer, Contract> STORAGE) {
        super(STORAGE);
    }

}
