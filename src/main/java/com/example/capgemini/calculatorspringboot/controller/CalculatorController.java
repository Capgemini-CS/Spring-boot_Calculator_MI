package com.example.capgemini.calculatorspringboot.controller;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenOperatorIsDifferent;
import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenSecondNumberIs0;
import com.example.capgemini.calculatorspringboot.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculateTwoNumbers(@RequestParam String firstNumber, @RequestParam String operator, @RequestParam String secondNumber) throws ExceptionWhenSecondNumberIs0, ExceptionWhenKeyIsInvalid, ExceptionWhenOperatorIsDifferent {
        int result = calculatorService.makeOperation(Integer.parseInt(firstNumber), operator, Integer.parseInt(secondNumber));

        return firstNumber + " " + operator + " " + secondNumber + " = " + result;
    }
}
