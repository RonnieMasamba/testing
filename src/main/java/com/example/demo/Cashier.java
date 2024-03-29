package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Cashier {

    private static final List<String> acceptedCurrencies = Arrays.asList("Euro", "GBP");

    public static double validateTransaction(String currency, double amount) {
        if (currencyIsAccepted(currency) && amountIsValid(amount)) {
            return amount;
        }
        return -1;
    }

    private static boolean currencyIsAccepted(String currency) {
        if (!acceptedCurrencies.contains(currency)) {
            throw new IllegalArgumentException("Currency" + currency + "not within accepted");
        }
        return true;
    }


    private static boolean amountIsValid(double amount) {
        if (amount < 0) {
            throw new InvalidTransactionAmount("Transction must be greater than 0");
        }
        return true;
    }
}
