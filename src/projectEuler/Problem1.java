package projectEuler;

// If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//
// Find the sum of all the multiples of 3 or 5 below 1000.
public class Problem1 {

    public static void main(String[] args) {
        int multiplesOf3And5 = getMultiplesOf3And5(3, 5, 1000);

        System.out.println(multiplesOf3And5);
    }

    private static int getMultiplesOf3And5(int number1, int number2, int from) {
        int sum = 0;

        for (int i = 0; i < from; i++) {
            if (i % number1 == 0 || i % number2 == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }
}
