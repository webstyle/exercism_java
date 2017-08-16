import java.util.Arrays;
import java.util.stream.IntStream;

class SumOfMultiples {
    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        return IntStream.range(1, this.number)
                .filter(i -> Arrays.stream(this.set).anyMatch(j -> i % j == 0))
                .sum();
    }
}
