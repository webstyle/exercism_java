class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int number) {
        int sumUpToNumber = number * (number + 1) / 2;
        return (int)Math.pow(sumUpToNumber, 2);
    }

    int computeSumOfSquaresTo(int number) {
        return (2 * (int)Math.pow(number, 2) + 3 * number + 1) * number / 6;
    }

    int computeDifferenceOfSquares(int number) {
        return this.computeSquareOfSumTo(number) - this.computeSumOfSquaresTo(number);
    }
}
