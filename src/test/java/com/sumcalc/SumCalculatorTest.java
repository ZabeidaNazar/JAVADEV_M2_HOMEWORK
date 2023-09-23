package com.sumcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
    void prepareSumCalculator() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testThatSum1Is1() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testThatSum3Is6() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void testThatSum0IsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
