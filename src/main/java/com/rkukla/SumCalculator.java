package com.rkukla;

public class SumCalculator {
    public int sum(int n) {
        int result = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        } else {
            throw new IllegalArgumentException("Invalid input data");
        }
        return result;
    }
}
