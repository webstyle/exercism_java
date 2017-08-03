import java.util.Arrays;
import java.util.List;

class Scrabble {
    private String word;
    private int score;
    List<String> oneBall = Arrays.asList("A", "E", "I", "O", "U", "L", "N", "R", "S", "T");
    List<String> twoBall = Arrays.asList("D", "G");
    List<String> threeBall = Arrays.asList("B", "C", "M", "P");
    List<String> fourBall = Arrays.asList("F", "H", "V", "W", "Y");
    List<String> fiveBall = Arrays.asList("K");
    List<String> eightBall = Arrays.asList("J", "X");
    List<String> tenBall = Arrays.asList("Q", "Z");

    Scrabble(String word) {
        this.word = word.toUpperCase();
        this.score = 0;
    }

    int getScore() {
        String[] strings = this.word.split("");

        for (String s: strings) {
            if (oneBall.contains(s)) updateScore(1);
            if (twoBall.contains(s)) updateScore(2);
            if (threeBall.contains(s)) updateScore(3);
            if (fourBall.contains(s)) updateScore(4);
            if (fiveBall.contains(s)) updateScore(5);
            if (eightBall.contains(s)) updateScore(8);
            if (tenBall.contains(s)) updateScore(10);
        }

        return this.score;
    }

    void updateScore(int number) {
        this.score += number;
    }

}
