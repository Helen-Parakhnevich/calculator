package com.epam.calculator;

import java.util.List;

public class Calculator {
    public static int add(int first, int second) {
        return first + second;
    }

    public static int subtract(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int divide(int first, int second) {
        try {
         return first / second;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by 0");
        }
    }

    public static double extractSquareRoot(double argument) {
        double result =0.0;

        result = Math.sqrt(argument);
        if (Double.isNaN(result)) {
            throw new ArithmeticException("The square root of a negative number does not exist");
        }
        else return result;
    }

    public static double extractRoot(double argument, double index) {
        double result =0.0;

        result = Math.pow(argument, 1/index);
        if (Double.isNaN(result) || Double.isInfinite(result)) {
            throw new ArithmeticException("Specified values cannot be used to extracting root");
        }
        else return result;
    }

    public static double raisePower(double base, double power) {
        return Math.pow(base, power);
    }

}
