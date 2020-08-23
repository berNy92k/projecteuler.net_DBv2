package projectEuler.till20;

// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
// What is the sum of the digits of the number 2^1000?

import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {
        int number = 1000;
        long result = powerDigitSum(number);

        System.out.println(result);
    }

    private static long powerDigitSum(int number) {
        BigInteger bigInteger = getBigInteger(number);
        String stringBigInt = String.valueOf(bigInteger);

        long result = 0;

        for (int i = 0; i < stringBigInt.length(); i++) {
            result = result + Integer.valueOf(String.valueOf(stringBigInt.charAt(i)));
        }

        return result;
    }

    private static BigInteger getBigInteger(int number) {
        int value = 2;
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 0; i < number; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(value));
        }

        return bigInteger;
    }
}
