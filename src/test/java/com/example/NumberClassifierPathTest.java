package com.example;

import com.example.NumberClassifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierPathTest {

    @Test
    void testMorePositive() {
        int[] arr = { 1, 2, -1 };
        assertEquals("More positive", NumberClassifier.classify(arr));
    }

    @Test
    void testMoreNegative() {
        int[] arr = { -1, -2, 3 };
        assertEquals("More negative", NumberClassifier.classify(arr));
    }

    @Test
    void testEqual() {
        int[] arr = { 1, -1 };
        assertEquals("Equal", NumberClassifier.classify(arr));
    }
}