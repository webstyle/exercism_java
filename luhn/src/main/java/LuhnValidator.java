import java.util.ArrayList;

import static java.lang.Integer.parseInt;

class LuhnValidator {

    boolean isValid(String candidate) {
        if (candidate == null) return false;

        String[] cardNumber = removeSpaces(candidate);
        ArrayList<Integer> integers = new ArrayList<Integer>();

        for (String string : cardNumber) {
            try {
                integers.add(parseInt(string));
            } catch (NumberFormatException e) {
                return false;
            }
        }

        if (integers.size() == 1) return false;

        integers = doubleEverySecondDigit(integers);
        int sum = 0;
        boolean result = false;

        for (Integer number: integers) {
            sum += number;
        }

        if (sum % 10 == 0) {
            result = true;
        } else {
            result =false;
        }

        return result;
    }


    String[] removeSpaces(String data) {
        String[] strings = data.split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }
        return result.toString().split("");
    }


    ArrayList<Integer> doubleEverySecondDigit(ArrayList<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            if (i % 2 != 0) {
                int number = integers.get(i) * 2;
                if (number > 9) {
                    number -= 9;
                }
                integers.set(i, number);
            }
        }
        return integers;
    }

}
