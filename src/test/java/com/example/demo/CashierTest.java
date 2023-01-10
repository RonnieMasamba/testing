package com.example.demo;

import org.junit.Before;
import org.junit.Test;

public class CashierTest {

    private Cashier cashier;
    @Before
    public void setUp(){
        cashier = new Cashier();
    }

    @Test(expected = RuntimeException.class)
    public void validateTransctionCurrency(){
        cashier.validateTransaction("Yen",10);


    }

    @Test(expected = RuntimeException.class)
    public void inValidTransctionCurrency() {
        cashier.validateTransaction("EUR", -10);

    }


    }
