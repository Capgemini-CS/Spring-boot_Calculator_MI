package com.example.capgemini.calculatorspringboot.output;

import org.springframework.stereotype.Component;

@Component
public class Output implements OutputInterface{

    @Override
    public void showOutput(int result) {
        System.out.println("Your result is : " + result);
    }
}
