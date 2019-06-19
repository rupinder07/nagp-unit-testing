package com.nagarro.nagp.shared;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnNegativeIfOneParamterIsNegative(){
        int result = calculator.multiply(-10, 10);
        Assert.assertEquals(-10, result);
        MatcherAssert.assertThat(result, Is.is(-10));
    }

    @Test
    public void shouldReturnZeroIfAnyParameterIsZero(){
        int result = calculator.multiply(0, 10);
    }
}