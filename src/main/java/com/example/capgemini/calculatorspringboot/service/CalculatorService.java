package com.example.capgemini.calculatorspringboot.service;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenSecondNumberIs0;
import com.example.capgemini.calculatorspringboot.input.NumberInput;
import com.example.capgemini.calculatorspringboot.input.OperatorInput;
import com.example.capgemini.calculatorspringboot.output.Output;
import com.example.capgemini.calculatorspringboot.service.operation.AdditionService;
import com.example.capgemini.calculatorspringboot.service.operation.DivideService;
import com.example.capgemini.calculatorspringboot.service.operation.MultiplyService;
import com.example.capgemini.calculatorspringboot.service.operation.SubtractService;
import com.example.capgemini.calculatorspringboot.validation.ParametersOfEquationValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final AdditionService additionService;
    private final SubtractService subtractService;
    private final MultiplyService multiplyService;
    private final DivideService divideService;

    @Autowired
    public CalculatorService(AdditionService additionService, SubtractService subtractService, MultiplyService multiplyService, DivideService divideService) {
        this.additionService = additionService;
        this.subtractService = subtractService;
        this.multiplyService = multiplyService;
        this.divideService = divideService;
    }


    public int makeOperation(int firstNumber, String operator, int secondNumber) throws ExceptionWhenOperatorIsDifferent, ExceptionWhenSecondNumberIs0 {
        int result = 0;
        switch (operator) {
            case "+":
                result = additionService.executeOperation(firstNumber, secondNumber);
                break;
            case "-":
                result = subtractService.executeOperation(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplyService.executeOperation(firstNumber, secondNumber);
                break;
            case "/":
                result = divideService.executeOperation(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}
