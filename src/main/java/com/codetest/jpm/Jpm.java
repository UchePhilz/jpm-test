/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.codetest.jpm;

import com.codetest.jpm.service.TradeService;
import java.util.Timer;

/**
 *
 * Java Requirement<br>
 * You have:<br>
 * 1. Some number of Trades, each with a Unique Id, Value (in £) and SLA (time
 * to be assigned by).<br>
 * 2. Some number of Contracts, each with a Unique Id and Description.<br>
 * 3. A specified amount of time (an Integer of hours).<br>
 * Your task is to write a Java application that assigns a Contract to each
 * Trade.<br>
 * 1 Contract can only be assigned to 1 Trade.<br>
 * The application should print all the Trades and their assigned Contracts.<br>
 * You should not use any external libraries, other than Junit + Mockito for
 * writing tests.<br>
 * If you have any questions or feel the requirement is unclear, make an
 * assumption and proceed with it, but in your<br>
 * submission, clearly state what assumption(s) you made.<br>
 *
 * @author Uche Powers
 */
public class Jpm {

    private int CONTRACT_TIMER = 1;

    public static void main(String[] args) {

        TradeService tradeService = new TradeService();
        tradeService.runAssignContract();
        

    }
}
