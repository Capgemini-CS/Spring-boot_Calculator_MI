package com.example.capgemini.calculatorspringboot.service;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenSecondNumberIs0;

public interface CalculatorInterface {
    void executeCalculation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenKeyIsInvalid, ExceptionWhenSecondNumberIs0;
}
