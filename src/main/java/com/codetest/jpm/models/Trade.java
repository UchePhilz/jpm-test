package com.codetest.jpm.models;

import java.util.Date;

/**
 *
 * @author Uche Powers
 */
public class Trade {

    private int id;
    private int value;
    private Date sla;
    private Contract contract;

    public Trade(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public Trade(int id, int value, Date sla) {
        this.id = id;
        this.value = value;
        this.sla = sla;
    }

    public Trade(int id, int value, Contract contract) {
        this.id = id;
        this.value = value;
        this.contract = contract;
    }

    public Trade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getSla() {
        return sla;
    }

    public void setSla(Date sla) {
        this.sla = sla;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "\nTrade{" + "id=" + id + ", value=" + value + ", sla=" + sla + ", \n\tcontract=" + contract + "}\n";
    }

}
