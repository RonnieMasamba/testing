package com.example.demo;

public class InvalidTransactionAmount extends RuntimeException {

    public InvalidTransactionAmount(String message) {
        super(message);
    }
}
