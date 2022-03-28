package com.example.capgemini.calculatorspringboot.input;

import com.example.capgemini.calculatorspringboot.exception.ExceptionWhenKeyIsInvalid;
import com.example.capgemini.calculatorspringboot.validation.InterfaceValidationNumber;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Component
public class NumberInput implements InterfaceValidationNumber {

    @Override
    public int inputFirstNumber() throws ExceptionWhenKeyIsInvalid {
        int number;
        Scanner scanner = new Scanner(System.in);
        try{
            number = scanner.nextInt();
        } catch (NumberFormatException numberFormatException) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return number;
    }

    @Override
    public int inputSecondNumber() throws ExceptionWhenKeyIsInvalid {
        int number;
        Scanner scanner = new Scanner(System.in);
        try{
            number = scanner.nextInt();
        } catch (NumberFormatException numberFormatException) {
            throw new ExceptionWhenKeyIsInvalid("Your parameter is not a valid key.");
        }
        return number;
    }
}
