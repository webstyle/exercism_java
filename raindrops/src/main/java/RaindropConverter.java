class RaindropConverter {
    private String result;

    RaindropConverter() {
        this.result = "";
    }

    String convert(int number) {

        if (number % 3 == 0) {
            this.append("Pling");
        } else if (number % 5 == 0) {
            this.append("Plang");
        } else if (number % 7 == 0) {
            this.append("Plong");
        } else {
            this.append(Integer.toString(number));
        }

        this.checkMultiple(number);

        return this.getResult();
    }

    private String getResult() {
        return this.result;
    }

    private void append(String input) {
        this.result += input;
    }

    private void reassign(String input) {
        this.result = input;
    }

    private void checkMultiple(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            this.reassign("PlingPlang");
        }

        if (number % 3 == 0 && number % 7 == 0) {
            this.reassign("PlingPlong");
        }

        if (number % 5 == 0 && number % 7 == 0) {
            this.reassign("PlangPlong");
        }

        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            this.reassign("PlingPlangPlong");
        }
    }

}
