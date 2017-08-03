public class Hamming {
    private String leftStrand;
    private String rightStrand;
    private int distance;

    /**
     * Hamming constructor
     *
     * @param leftStrand  String
     * @param rightStrand String
     * @throws IllegalArgumentException
     */
    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    /**
     * Get hamming distance
     *
     * @return int
     */
    int getHammingDistance() {
        String[] splitedLeft = this.leftStrand.split("");
        String[] splitedRight = this.rightStrand.split("");

        for (int i = 0; i < splitedLeft.length; i++) {
            if (!splitedLeft[i].equals(splitedRight[i])) {
                this.distanceInc();
            }
        }
        return this.getDistance();
    }

    /**
     * distance getter
     *
     * @return int
     */
    public int getDistance() {
        return distance;
    }

    /**
     * distance incrementer
     */
    private void distanceInc() {
        this.distance++;
    }
}
