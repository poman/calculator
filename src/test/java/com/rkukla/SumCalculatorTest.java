package com.rkukla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private static SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    @DisplayName("Check sumCalculator.sum(1)")
    public void testThatSumCalculatorWorksOkWith1(){
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check sumCalculator.sum(3)")
    public void testThatSumCalculatorWorksOkWith3(){
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check sumCalculator.sum(0)")
    public void testThatSumCalculatorWorksOkWith0(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}