package projectEuler.till20;

// Factorial digit sum


// n! means n × (n − 1) × ... × 3 × 2 × 1
//
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
// and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
// Find the sum of the digits in the number 100!

import java.math.BigInteger;

public class Problem20 {

    public static void main(String[] args) {
        int factorialNumber = 100;
        BigInteger factorial = factorial(factorialNumber);
        long result = digitSum(factorial);
        System.out.println(result);
    }

    private static long digitSum(BigInteger factorial) {
        String factorialString = factorial.toString();
        long sum = 0L;
        for (int i = 0; i < factorialString.length(); i++) {
            sum = sum + Long.parseLong(String.valueOf(factorialString.charAt(i)));
        }
        return sum;
    }

    private static BigInteger factorial(int factorialNumber) {
        BigInteger result = BigInteger.ONE;

        for (int i = factorialNumber; i > 0; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
