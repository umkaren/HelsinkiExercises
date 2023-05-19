package validating;

public class Calculator {

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("The number must be greater than zero.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (subsetSize < 0 || setSize < 0) {
            throw new IllegalArgumentException("Parameters cannot be negative.");
        }

        if (subsetSize > setSize ) {
            throw new IllegalArgumentException("Subset cannot be larger than the set.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
