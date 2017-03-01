package com.codeclan.example.simplecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 28/02/2017.
 */

public class TestCalculator {

//    instance variables
    Calculator calculator;

//    constructor
    @Before
    public void before() {
        calculator = new Calculator();
    }

//    method tests
    @Test
    public void testAddNumbers() {
        assertEquals(2, calculator.addNumbers(1, 1));
    }

}
