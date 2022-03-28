package com.example.capgemini.calculatorspringboot.service.operation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenSecondNumberIs0;

public interface IOperation {
    int executeOperation(int firstNumber, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0;
}
