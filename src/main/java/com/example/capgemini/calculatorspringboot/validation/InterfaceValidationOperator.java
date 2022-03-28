package com.example.capgemini.calculatorspringboot.validation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;

public interface InterfaceValidationOperator {
    String inputOperator() throws ExceptionWhenOperatorIsDifferent;
}
