public class RnaTranscription {

    public static String transcribe(String dnaStrand) {
        StringBuilder result = new StringBuilder();
        String[] characters = dnaStrand.split("");

        for (String x: characters) {
            if (x.equals("G")) {
                result.append("C");
            }
            if (x.equals("C")) {
                result.append("G");
            }
            if (x.equals("T")) {
                result.append("A");
            }
            if (x.equals("A")) {
                result.append("U");
            }
        }

        return result.toString();
    }
}