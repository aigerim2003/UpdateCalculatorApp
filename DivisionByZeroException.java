package com.example.calculatorapp;

public class DivisionByZeroException  extends Exception{
    public DivisionByZeroException(String s) {
        super("Division by zero is not allowed.");
    }
}