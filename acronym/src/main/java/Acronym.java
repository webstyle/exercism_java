class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase.toUpperCase();
    }

    String get() {
        String result = "";
        String[] mainCharacters = this.phrase.split(" ");

        for (int i = 0; i < mainCharacters.length; i++) {
            result += mainCharacters[i].charAt(0);
            String[] subCharacters = mainCharacters[i].split("-");
            if (subCharacters.length == 2) {
                result += subCharacters[1].charAt(0);
            }
        }

        return result;
    }

}
