/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.codetest.jpm.storage.abstractions;

import java.util.Optional;

/**
 *
 * @author Uche Powers
 * @param <T>
 */
public interface StorageInterface<T> {

    public Optional<T> add(int id, T t);

    public Optional<T> modify(int id, T t);

    public Optional<T> get(int id);

    public Optional<T> remove(int id);

    public boolean idExist(int id);

    public String printData();

}
