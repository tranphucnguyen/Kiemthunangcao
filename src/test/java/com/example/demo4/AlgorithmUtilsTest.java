package com.example.demo4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AlgorithmUtilsTest {

    @Test
    void testFactorial() {
        assertEquals(1, AlgorithmUtils.factorial(0));
        assertEquals(1, AlgorithmUtils.factorial(1));
        assertEquals(120, AlgorithmUtils.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.factorial(-1));
    }

    @Test
    void testIsPrime() {
        assertFalse(AlgorithmUtils.isPrime(0));
        assertFalse(AlgorithmUtils.isPrime(1));
        assertTrue(AlgorithmUtils.isPrime(2));
        assertTrue(AlgorithmUtils.isPrime(13));
        assertFalse(AlgorithmUtils.isPrime(15));
    }
    @Test
    void testIsPrimeAdditionalCases() {
        assertFalse(AlgorithmUtils.isPrime(4)); // Chia hết cho 2
        assertFalse(AlgorithmUtils.isPrime(9)); // Chia hết cho 3
    }

}