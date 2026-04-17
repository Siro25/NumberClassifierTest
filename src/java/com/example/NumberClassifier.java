package com.example;

public class NumberClassifier {

    public static String classify(int[] arr) {
        int positive = 0;
        int negative = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        if (positive > negative) {
            return "More positive";
        } else if (negative > positive) {
            return "More negative";
        } else {
            return "Equal";
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3 };
        System.out.println(classify(arr));
    }
}