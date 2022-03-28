package com.example.capgemini.calculatorspringboot.exception;

public class ExceptionWhenOperatorIsDifferent extends Exception {
    public ExceptionWhenOperatorIsDifferent(String message){
        super(message);
    }
}