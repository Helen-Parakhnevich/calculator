package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 1;
        int secondArgument = 2;

        //when
        int result = calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testSubtractWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 1;
        int secondArgument = 2;

        //when
        int result = calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSubtractWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = calculator.multiply(firstArgument, secondArgument);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        //given
        Calculator calculator = new Calculator();
        int firstArgument = 1;
        int secondArgument = 0;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(firstArgument, secondArgument);
        });
    }

    @Test
    public void testExtractSquareRootWhenNumberPositive() {
        //given
        Calculator calculator = new Calculator();
        double argument = 25;

        //when
        double result = calculator.extractSquareRoot(argument);

        //then
        Assert.assertEquals(5, result, 0.0001);
    }

    @Test
    public void testExtractSquareRootWhenNumberNegative() {
        //given
        Calculator calculator = new Calculator();
        double argument = -25;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.extractSquareRoot(argument);
        });
    }

    @Test
    public void testExtractRootWhenBasePositiveIndexPositive() {
        //given
        Calculator calculator = new Calculator();
        double argument = 25;
        double index = 2;

        //when
        double result = calculator.extractRoot(argument, index);

        //then
        Assert.assertEquals(5, result, 0.0001);
    }

    @Test
    public void testExtractRootWhenBaseNegativeIndexOdd() {
        //given
        Calculator calculator = new Calculator();
        double argument = -25;
        double index = 2;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.extractRoot(argument, index);
        });
    }

    @Test
    public void testExtractRootWhenIndexZero() {
        //given
        Calculator calculator = new Calculator();
        double argument = 25;
        double index = 0;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.extractRoot(argument, index);
        });
    }

    @Test
    public void testRaisePowerWhenBasePositivePowerPositive() {
        //given
        Calculator calculator = new Calculator();
        double base = 5;
        double power = 3;

        //when
        double result = calculator.raisePower(base, power);

        //then
        Assert.assertEquals(125, result, 0.0001);
    }

    @Test
    public void testRaisePowerWhenBasePositivePowerNegative() {
        //given
        Calculator calculator = new Calculator();
        double base = 5;
        double power = -3;

        //when
        double result = calculator.raisePower(base, power);

        //then
        Assert.assertEquals(0.008, result, 0.0001);
    }

    @Test
    public void testRaisePowerWhenBaseNegativePowerPositive() {
        //given
        Calculator calculator = new Calculator();
        double base = -5;
        double power = 2;

        //when
        double result = calculator.raisePower(base, power);

        //then
        Assert.assertEquals(25, result, 0.0001);
    }
}