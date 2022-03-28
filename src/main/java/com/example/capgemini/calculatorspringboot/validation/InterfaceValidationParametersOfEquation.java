package com.example.capgemini.calculatorspringboot.validation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;

public interface InterfaceValidationParametersOfEquation {
    int checkNumberOfEquation(int number) throws ExceptionWhenKeyIsInvalid;
    String checkOperatorOfEquation(String operator);
}
