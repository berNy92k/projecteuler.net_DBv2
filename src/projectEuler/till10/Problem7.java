package projectEuler.till10;

// By listing the first six prime numbers:
// 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?

public class Problem7 {

    public static void main(String[] args) {
        int numberOfFirstXPrimeNumbers = 10001;
        long result = n10001stPrime(numberOfFirstXPrimeNumbers);

        System.out.println(result);
    }

    private static long n10001stPrime(int numberOfFirstXPrimeNumbers) {
        long result = 0L;
        int xPrimeNumber = 0;

        long n = 0;
        while (xPrimeNumber <= numberOfFirstXPrimeNumbers) {
            n++;

            int counter = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                result = n;
                xPrimeNumber++;
            }
        }

        return result;
    }
}
