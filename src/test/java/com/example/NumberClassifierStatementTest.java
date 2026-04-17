package com.example;

import com.example.NumberClassifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierStatementTest {

    @Test
    void testStatementCoverage() {
        int[] arr = { 1, -1 };
        String result = NumberClassifier.classify(arr);
        assertNotNull(result);
    }
}