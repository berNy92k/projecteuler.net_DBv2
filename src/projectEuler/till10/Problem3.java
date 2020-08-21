package projectEuler.till10;

// The prime factors of 13195 are 5, 7, 13 and 29.
//
// What is the largest prime factor of the number 600851475143 ?

public class Problem3 {

    public static void main(String[] args) {
        long result = largestPrimeFactor(600851475143L);

        System.out.println(result);
    }

    private static long largestPrimeFactor(long number) {
        long largestPrimeFactor = 0L;

        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                long counter = 0;
                for (long j = 2; j < i / 2; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }

                if (counter <= 1) {
                    largestPrimeFactor = i;
                }
            }
        }

        return largestPrimeFactor;
    }
}
