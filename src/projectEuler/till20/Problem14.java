package projectEuler.till20;

// The following iterative sequence is defined for the set of positive integers:
//
//  n → n/2 (n is even)
//  n → 3n + 1 (n is odd)
//
//  Using the rule above and starting with 13, we generate the following sequence:
//
//                  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//
//  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
//  Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//  Which starting number, under one million, produces the longest chain?
//
//  NOTE: Once the chain starts the terms are allowed to go above one million.

public class Problem14 {

    public static void main(String[] args) {
        int maxNumberToCheck = 1000000;
        long result = longestCollatzSequence(maxNumberToCheck);

        System.out.println(result);
    }

    private static long longestCollatzSequence(int maxNumberToCheck) {
        long result = 0L;
        int longestChain = 0;
        for (int i = 1; i < maxNumberToCheck; i++) {
            int actualChain = 1;
            long n = i;
            while (n > 1) {
                if (n % 2 == 0) {
                    n = calculateForEven(n);
                } else {
                    n = calculateForOdd(n);
                }
                actualChain++;
            }

            if (longestChain < actualChain) {
                longestChain = actualChain;
                result = i;
            }
        }


        return result;
    }

    //  n → 3n + 1 (n is odd)
    private static long calculateForOdd(long oddToCalculate) {
        return 3 * oddToCalculate + 1;
    }

    //  n → n/2 (n is even)
    private static long calculateForEven(long evenToCalculate) {
        return evenToCalculate / 2;
    }
}
