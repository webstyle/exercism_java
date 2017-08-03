public class Twofer {
    public String twofer(String input) {
        String output = "you";
        if (input != null) {
            output = input;
        }

        return "One for " + output + ", one for me.";
    }
}