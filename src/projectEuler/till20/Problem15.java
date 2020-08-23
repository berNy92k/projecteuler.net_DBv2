package projectEuler.till20;

// Starting in the top left corner of a 2×2 grid,
// and only being able to move to the right and down,
// there are exactly 6 routes to the bottom right corner.
//
//      PIC was here ->  https://projecteuler.net/problem=15
//
// How many such routes are there through a 20×20 grid?

import java.math.BigInteger;

public class Problem15 {

    public static void main(String[] args) {
        int gridLengthHorizontally = 20;
        int gridLengthPerpendicularly = 20;
        BigInteger result = latticePaths(gridLengthHorizontally, gridLengthPerpendicularly);

        System.out.println(result);
    }

    private static BigInteger latticePaths(int gridLengthHorizontally,
                                           int gridLengthPerpendicularly) {

        long totalSum = gridLengthHorizontally + gridLengthPerpendicularly;
        long lowerNumber = gridLengthPerpendicularly < gridLengthHorizontally ? gridLengthPerpendicularly : gridLengthHorizontally;

        BigInteger nominator = BigInteger.ONE;
        for (long i = totalSum; i > lowerNumber; i--) {
            nominator = nominator.multiply(BigInteger.valueOf(i));
        }

        BigInteger denominator = BigInteger.ONE;
        for (long i = lowerNumber; i > 1; i--) {
            denominator = denominator.multiply(BigInteger.valueOf(i));
        }

        return nominator.divide(denominator);
    }
}
