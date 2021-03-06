package com.example.capgemini.calculatorspringboot.service.operation;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenSecondNumberIs0;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class DivideService implements IOperation {

    @Override
    public int executeOperation(int firstNumber, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0 {
            if (checkValidationNumber(secondNumber)) {
                Logger.error("You should check the second parameter");
            }
        return firstNumber / secondNumber;
    }

    private boolean checkValidationNumber(int secondNumber) throws ExceptionWhenSecondNumberIs0 {
        if(secondNumber == 0){
            throw new ExceptionWhenSecondNumberIs0("The second number must be different from 0");
        }
        return true;
    }


}
