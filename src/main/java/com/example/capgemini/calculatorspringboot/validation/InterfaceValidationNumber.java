package com.example.capgemini.calculatorspringboot.validation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;

public interface InterfaceValidationNumber {
    int inputFirstNumber() throws ExceptionWhenKeyIsInvalid;
    int inputSecondNumber() throws  ExceptionWhenKeyIsInvalid;
}
