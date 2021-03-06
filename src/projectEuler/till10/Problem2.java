package projectEuler.till10;

// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
// By considering the terms in the Fibonacci sequence whose values
// do not exceed four million, find the sum of the even-valued terms.

public class Problem2 {

    public static void main(String[] args) {
        long result = calculateFibonacci(4000000L);

        System.out.println(result);
    }

    private static long calculateFibonacci(long maxNumber) {
        long sum = 0L;

        long l1 = 1L;
        long l2 = 1L;
        long actualResult = 0L;

        while (actualResult <= maxNumber) {
            if (actualResult % 2 == 0) {
                sum = sum + actualResult;
            }

            actualResult = l1 + l2;
            l1 = l2;
            l2 = actualResult;
        }

        return sum;
    }
}
