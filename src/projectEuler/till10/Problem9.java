package projectEuler.till10;

// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
// a2 + b2 = c2
// For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class Problem9 {

    public static void main(String[] args) {
        int resultOfSum = 1000;
        long result = specialPythagoreanTriplet(resultOfSum);

        System.out.println(result);
    }

    private static long specialPythagoreanTriplet(int resultOfSum) {
        long result = 0L;

        for (int a = 1; a < resultOfSum; a++) {
            for (int b = 2; b < resultOfSum; b++) {
                for (int c = 3; c < resultOfSum; c++) {
                    if (checkIfSumEqualsRequestedResult(a, b, c, resultOfSum)
                            && checkIfSumOfMultipleForAAndBEqualsMultipleOfC(a, c, b)) {
                        result = a * b * c;
                        break;
                    }
                }
            }
        }

        return result;
    }

    // a + b + c = 1000
    private static boolean checkIfSumEqualsRequestedResult(int a,
                                                           int b,
                                                           int c,
                                                           int resultOfSum) {
        return a + b + c == resultOfSum;
    }

    // a2 + b2 = c2
    private static boolean checkIfSumOfMultipleForAAndBEqualsMultipleOfC(int a,
                                                                         int b,
                                                                         int c) {
        return ((a * a) + (b * b) == (c * c));
    }
}
