package projectEuler.till10;

// 2520 is the smallest number that can be divided
// by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is
// evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {

    public static void main(String[] args) {
        int from1toX = 20;
        long result = smallestMultiple(from1toX);

        System.out.println(result);
    }

    private static long smallestMultiple(int from1toX) {
        long smallestMultiple = 0L;
        long n = 0L;
        while (smallestMultiple == 0L) {
            n++;
            int counter = 0;
            for (int i = 1; i <= from1toX; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }

            if (counter == from1toX) {
                smallestMultiple = n;
            }
        }
        return smallestMultiple;
    }
}
