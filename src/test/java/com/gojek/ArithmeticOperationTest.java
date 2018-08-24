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
    public void testShouldReturnZeroIfBothTheInputsAreZero() throws Exception {
        assertEquals(0, arithmeticOperation.add(0, 0));
    }

    @Test
    public void testShouldReturnFirstNumberIfSecondNumIsZero() throws Exception {
        assertEquals(3, arithmeticOperation.add(3, 0));
    }

    @Test
    public void testShouldReturnSecondNumberIfFirstNumIsZero() throws Exception {
        assertEquals(5, arithmeticOperation.add(0, 5));

    }

    @Test
    public void testShouldReturnSumIfBothNumberIsPresent() throws Exception {
        assertEquals(10, arithmeticOperation.add(5, 5));
    }

    @Test
    public void testShouldReturnZeroIfBothTheInputsAreZeroForSubstraction() throws Exception {
        assertEquals(0, arithmeticOperation.substract(0, 0));
    }
}