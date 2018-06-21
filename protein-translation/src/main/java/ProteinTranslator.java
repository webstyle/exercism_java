import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String str) {
        List<String> proteins = new ArrayList<String>();
        List<String> parts = getParts(str, 3);
        

        if (parts.contains("AUG")) {
            proteins.add("Methionine");
        }

        if (parts.contains("UUU") || parts.contains("UUC")) {
            proteins.add("Phenylalanine");
        }

        if (parts.contains("UUA") || parts.contains("UUG")) {
            proteins.add("Leucine");
        }

        if (parts.contains("UCU") || parts.contains("UCC") || parts.contains("UCA") || parts.contains("UCG")) {
            proteins.add("Serine");
        }

        if (parts.contains("UAU") || parts.contains("UAC")) {
            proteins.add("Tyrosine");
        }

        if (parts.contains("UGU") || parts.contains("UGC")) {
            proteins.add("Cysteine");
        }

        if (parts.contains("UGG")) {
            proteins.add("Tryptophan");
        }

        if (parts.contains("UAA") && parts.contains("UAG") && parts.contains("UGA")) {
            proteins.add("STOP");
        }

        return proteins;
    }

    private static List<String> getParts(String string, int partitionSize) {
        List<String> parts = new ArrayList<String>();
        int len = string.length();
        for (int i=0; i<len; i+=partitionSize)
        {
            parts.add(string.substring(i, Math.min(len, i + partitionSize)));
        }
        return parts;
    }
}