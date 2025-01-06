package com.example.demo4;

public class AlgorithmUtils {

    // Thuật toán tính giai thừa
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Thuật toán kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
