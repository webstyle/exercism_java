import java.util.ArrayList;

class NaturalNumber {
    private int number;

    NaturalNumber(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        int numbersResult = 0;
        Classification result = Classification.DEFICIENT;

        for (int i = 1; i < this.number; i++) {
            if (this.number % i == 0) {
                integerArrayList.add(i);
            }
        }

        for (Integer i : integerArrayList) {
            numbersResult += i;
        }

        if (numbersResult == this.number) {
            result = Classification.PERFECT;
        } else if (numbersResult > this.number) {
            result = Classification.ABUNDANT;
        } else if (numbersResult < this.number) {
            result = Classification.DEFICIENT;
        }

        return result;
    }

}
