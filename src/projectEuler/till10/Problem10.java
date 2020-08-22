package projectEuler.till10;

// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.

import java.util.LinkedList;
import java.util.List;

public class Problem10 {

    public static void main(String[] args) {
        int primesBelowX = 2000000;
        long result = summationOfPrimes(primesBelowX);

        System.out.println(result);
    }

    private static long summationOfPrimes(int primesBelowX) {
        long result = 0L;
        List<Integer> primeList = new LinkedList<>();

        for (int i = 2; i < primesBelowX; i++) {
            int counter = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                primeList.add(i);
            }
        }

        for (Integer integer : primeList) {
            result = result + integer;
        }

        return result;
    }
}
