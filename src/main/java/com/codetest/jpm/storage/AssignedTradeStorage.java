/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.storage;

import com.codetest.jpm.storage.abstractions.StorageAbstraction;
import com.codetest.jpm.models.Trade;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Uche Powers
 */
public class AssignedTradeStorage extends StorageAbstraction<Trade> {

    public AssignedTradeStorage(Map<Integer, Trade> STORAGE) {
        super(STORAGE);
    }

}
