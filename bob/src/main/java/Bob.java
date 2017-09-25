public class Bob {
    String hey(String msg) {
        if (msg.split(" ").length == 0 || msg.length() == 0) return "Fine. Be that way!";
        if (msg.toUpperCase().equals(msg) && !msg.toLowerCase().equals(msg)) return "Whoa, chill out!";
        char lastLetter = msg.charAt(msg.length() - 1);
        if (lastLetter == '?') return "Sure.";

        return "Whatever.";
    }
}
