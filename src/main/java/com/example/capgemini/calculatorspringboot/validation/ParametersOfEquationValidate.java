package com.example.capgemini.calculatorspringboot.validation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;
import org.springframework.stereotype.Component;

@Component
public class ParametersOfEquationValidate implements InterfaceValidationParametersOfEquation{

    @Override
    public int checkNumberOfEquation(int number) throws ExceptionWhenKeyIsInvalid {
        if(number <0){
            throw new ExceptionWhenKeyIsInvalid("Your number must be greater than 0");
        }
        return number;
    }

    @Override
    public String checkOperatorOfEquation(String operator) {
        String eqOperator = "";
        if(!eqOperator.equals(operator)){
            eqOperator = operator;
        }
        return eqOperator;
    }
}