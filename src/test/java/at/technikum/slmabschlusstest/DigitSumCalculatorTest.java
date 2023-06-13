package at.technikum.slmabschlusstest;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {


    @Test
    void calculateSumTest() {
        int number = 1234;
        int expected = 10;
        assertEquals(expected,DigitSumCalculator.CalculateSum(number) );

        number = 1111;
        expected = 4;
        assertEquals(expected,DigitSumCalculator.CalculateSum(number) );
    }
}