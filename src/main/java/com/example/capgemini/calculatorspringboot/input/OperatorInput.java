package com.example.capgemini.calculatorspringboot.input;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.validation.InterfaceValidationOperator;
import com.example.capgemini.calculatorspringboot.validation.OperatorValidate;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class OperatorInput implements InterfaceValidationOperator {

    @Override
    public String inputOperator() throws ExceptionWhenOperatorIsDifferent {
        String operator;
        Scanner scanner = new Scanner(System.in);
        operator = scanner.nextLine();
        if(!OperatorValidate.checkIfOperatorIsCorrect(operator)){
            throw new ExceptionWhenOperatorIsDifferent("Your operator is not correct.");
        }
        return operator;
    }
}
