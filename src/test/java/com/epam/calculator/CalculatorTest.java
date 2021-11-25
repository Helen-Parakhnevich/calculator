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
        int result = Calculator.Add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAddWhenNumbersNegative() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.Add(firstArgument, secondArgument);

        //then
        Assert.assertEquals(-3, result);
    }

    @Test
    public void testSubtractionWhenNumbersNegative() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.Subtraction(firstArgument, secondArgument);

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMultiplication() {
        //given
        int firstArgument = -1;
        int secondArgument = -2;

        //when
        int result = Calculator.Multiplication(firstArgument, secondArgument);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testDivisionByZero() {
        //given
        int firstArgument = 1;
        int secondArgument = 0;

        //when
        int result = Calculator.Division(firstArgument, secondArgument);

        //then
        Assert.assertEquals(0, result);
    }
}
