class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder text = new StringBuilder();
        if (this.words.length == 0) return text.toString();


        for (int i = 0; i < this.words.length; i++) {
            if (this.words.length > i + 1) {
                text.append(generateText(this.words[i], this.words[i + 1]));
            }
        }


        text.append("And all for the want of a ").append(this.words[0]).append(".");
        return text.toString();
    }

    private String generateText(String first, String second) {
        return "For want of a " + first + " the " + second + " was lost.\n";
    }

}
