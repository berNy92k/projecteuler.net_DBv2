package projectEuler.till10;

// The sum of the squares of the first ten natural numbers is,
// 1^2 + 2^2 _..._10^2=385

// The square of the sum of the first ten natural numbers is,
// (1+2+...+10)^2=55^=3025

// Hence the difference between the sum of the squares
// of the first ten natural numbers and the square of the sum is .
// 3025 - 385 = 2640

// Find the difference between the sum of the squares
// of the first one hundred natural numbers and the square of the sum.

public class Problem6 {

    public static void main(String[] args) {
        int firstXNaturalNumber = 100;
        long result = sumSquareDifference(firstXNaturalNumber);

        System.out.println(result);
    }

    private static long sumSquareDifference(int firstXNaturalNumber) {
        long sumOfTheSquaresOfFirstXNaturalNumbers = sumOfTheSquaresOfFirstXNaturalNumbers(firstXNaturalNumber);
        long squareOfTheSumOfFirstXNaturalNumbers = squareOfTheSumOfFirstXNaturalNumbers(firstXNaturalNumber);

        return squareOfTheSumOfFirstXNaturalNumbers - sumOfTheSquaresOfFirstXNaturalNumbers;
    }

    // The sum of the squares of the first 'x' natural numbers
    // 1^2 + 2^2 _..._10^2=385
    private static long sumOfTheSquaresOfFirstXNaturalNumbers(int firstXNaturalNumber) {
        long result = 0L;

        for (int i = 1; i <= firstXNaturalNumber; i++) {
            result = result + i * i;
        }

        return result;
    }

    // The square of the sum of the first 'x' natural numbers
    // (1+2+...+10)^2=55^2=3025
    private static long squareOfTheSumOfFirstXNaturalNumbers(int firstXNaturalNumber) {
        long result = 0L;

        for (int i = 1; i <= firstXNaturalNumber; i++) {
            result = result + i;
        }

        return result * result;
    }
}
