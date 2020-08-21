package projectEuler.till10;

// A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {

    public static void main(String[] args) {
        int xDigitNumber = 3;
        long result = palindromeNumber(xDigitNumber);

        System.out.println(result);
    }

    private static long palindromeNumber(int xDigitNumber) {
        int maxNumber = 100;
        if (xDigitNumber == 3) {
            maxNumber = 1000;
        }

        long maxPalindromeLong = 0L;

        for (int i = 1; i < maxNumber; i++) {
            for (int j = 1; j < maxNumber; j++) {
                long resultInt = i * j;
                if (resultInt > maxPalindromeLong && isPalindrome(resultInt)) {
                    maxPalindromeLong = resultInt;
                }
            }
        }
        return maxPalindromeLong;
    }

    private static boolean isPalindrome(long resultLong) {
        String resultString = String.valueOf(resultLong);
        int length = resultString.length();
        int n = 0;
        while (n <= length / 2) {
            if (resultString.charAt(n) != resultString.charAt(length - n - 1)) {
                return false;
            }
            n++;
        }

        return true;
    }
}
