package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddWhenNumbersPositive() {
        //given
        int firstArgument = 1;
        int secondArgument = 2;

        //when
        int result = Calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddWhenNumbersNegative() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testSubtractWhenNumbersPositive() {
        //given
        int firstArgument = 1;
        int secondArgument = 2;

        //when
        int result = Calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSubtractWhenNumbersNegative() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.subtract(firstArgument, secondArgument);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.multiply(firstArgument, secondArgument);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        //given
        int firstArgument = 1;
        int secondArgument = 0;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> Calculator.divide(firstArgument, secondArgument));
    }

    @Test
    public void testExtractSquareRootWhenNumberPositive() {
        //given
        double argument = 25;

        //when
        double result = Calculator.extractSquareRoot(argument);

        //then
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void testExtractSquareRootWhenNumberNegative() {
        //given
        double argument = -25;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> Calculator.extractSquareRoot(argument));
    }

    @Test
    public void testExtractRootWhenBasePositiveIndexPositive() {
        //given
        double argument = 25;
        double index = 2;

        //when
        double result = Calculator.extractRoot(argument, index);

        //then
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void testExtractRootWhenBaseNegativeIndexOdd() {
        //given
        double argument = -25;
        double index = 2;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> Calculator.extractRoot(argument, index));
    }

    @Test
    public void testExtractRootWhenIndexZero() {
        //given
        double argument = 25;
        double index = 0;

        //then
        Assert.assertThrows(ArithmeticException.class, () -> Calculator.extractRoot(argument, index));
    }

    @Test
    public void testRaisePowerWhenBasePositivePowerPositive() {
        //given
        double base = 5;
        double power = 3;

        //when
        double result = Calculator.raisePower(base, power);

        //then
        Assert.assertEquals(125, result, 0.0);
    }

    @Test
    public void testRaisePowerWhenBasePositivePowerNegative() {
        //given
        double base = 5;
        double power = -3;

        //when
        double result = Calculator.raisePower(base, power);

        //then
        Assert.assertEquals(0.008, result, 0.0);
    }

    @Test
    public void testRaisePowerWhenBaseNegativePowerPositive() {
        //given
        double base = -5;
        double power = 2;

        //when
        double result = Calculator.raisePower(base, power);

        //then
        Assert.assertEquals(25, result, 0.0);
    }
}