package com.epam.calculator;

public class Calculator {
    public static int Add(int first, int second) {
        return first + second;
    }

    public static int Subtraction(int first, int second) {
        return first - second;
    }

    public static int Multiplication(int first, int second) {
        return first * second;
    }

    public static int Division(int first, int second) {
        try {
         return first / second;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
