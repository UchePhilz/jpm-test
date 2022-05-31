/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codetest.jpm.storage.abstractions;

import com.codetest.jpm.models.Contract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author Uche Powers
 * @param <T>
 */
public abstract class StorageAbstraction<T> implements StorageInterface<T> {

    private final Map<Integer, T> STORAGE;

    public StorageAbstraction(Map<Integer, T> STORAGE) {
        this.STORAGE = STORAGE;
    }

    @Override
    public Optional<T> add(int id, T t) {
        T t2 = STORAGE.put(id, t);
        return Optional.ofNullable(t2);
    }

    @Override
    public Optional<T> modify(int id, T trade) {
        T t2;
        if (idExist(id)) {
            t2 = STORAGE.put(id, trade);
        } else {
            t2 = null;
        }
        return Optional.ofNullable(t2);
    }

    public Optional<T> getNextData() {
        Integer nextId = STORAGE.keySet().iterator().next();
        return get(nextId);
    }

    public boolean hasMoreElement() {
        return STORAGE.keySet().iterator().hasNext();
    }

    @Override
    public Optional<T> get(int id) {
        T t2 = STORAGE.get(id);
        return Optional.ofNullable(t2);
    }

    @Override
    public Optional<T> remove(int id) {
        T t2 = STORAGE.remove(id);
        return Optional.ofNullable(t2);
    }

    @Override
    public boolean idExist(int id) {
        return STORAGE.containsKey(id);
    }

    @Override
    public String printData() {
        return STORAGE.toString();
    }

}
