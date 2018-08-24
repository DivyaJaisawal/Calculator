package com.gojek;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArithmeticOperationTest {

    ArithmeticOperation arithmeticOperation = null;

    @Before
    public void setUp() throws Exception {
        arithmeticOperation = new ArithmeticOperation();
    }

    @Test
    public void shouldReturnZeroIfBothTheInputsAreZero() throws Exception {
        assertEquals(0, arithmeticOperation.add(0, 0));
    }

    @Test
    public void shouldReturnFirstNumberIfSecondNumIsZero() throws Exception {
        assertEquals(3, arithmeticOperation.add(3, 0));
    }

    @Test
    public void shouldReturnSecondNumberIfFirstNumIsZero() throws Exception {
        assertEquals(5, arithmeticOperation.add(0, 5));

    }

    @Test
    public void shouldReturnSumIfBothNumberIsPresent() throws Exception {
        assertEquals(10, arithmeticOperation.add(5, 5));
    }

    @Test
    public void shouldReturnZeroIfBothTheInputsAreZeroForSubstraction() throws Exception {
        assertEquals(0, arithmeticOperation.substract(0, 0));
    }

    @Test
    public void testSubstraction() throws Exception {
        assertEquals(5, arithmeticOperation.substract(10, 5));
    }

    @Test
    public void shouldReturnZeroIfMultiplierIsZero() throws Exception {
        assertEquals(0, arithmeticOperation.multipy(0, 10));
    }

    @Test
    public void shouldReturnNumWhenMultiplierIsOne() throws Exception {
        assertEquals(19, arithmeticOperation.multipy(1, 19));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(16, arithmeticOperation.multipy(4, 4));
    }

    @Test
    public void shouldReturnTheNumberItselfWhenDividedByOne() throws Exception {
        assertEquals(15, arithmeticOperation.divide(15, 1));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(100, arithmeticOperation.divide(1000, 10));
    }
}