package by.tms.lesson9.homework.utils;

public class StringUtils {

    public static void print(char[] inputArray) {
        for (char itm : inputArray) {
            System.out.print(itm);
        }
    }

    public static void println(char[] inputArray) {

        for (char itm : inputArray) {
            System.out.print(itm);
        }
        System.out.println('\n');
    }

    public static boolean isBlank(char[] inputArray) {

        int count = 0;

        if (inputArray.length == 0) {
            return true;
        } else {
            for (char itm : inputArray) {
                if (Character.isWhitespace(itm)) {
                    count++;
                }
            }
        }
        return count == inputArray.length;
    }

    public static boolean isRussian(char... inputArray) {

        for (char itm : inputArray) {
            if ((itm < 'А' || itm > 'я') && (itm != 'Ё' && itm != 'ё')) {
                return false;
            }
        }
        return true;
    }

    public static boolean contains(char[] mainString, char[] substring) {

        if (substring.length > mainString.length || mainString.length == 0 || substring.length == 0) {
            throw new IllegalArgumentException("Something in the arguments is wrong!");
        }

        for (int i = 0; i < mainString.length - 1; i++) {
            int match = 0;
            for (int j = 0; j < substring.length; j++) {
                if (mainString[i + j] != substring[j]) {
                    break;
                } else {
                    match++;
                }
            }
            if (match == substring.length) return true;
        }

        return false;
    }

    public static int parseInt(char[] inputArray) {

        int result = 0;
        int degree = inputArray.length - 1;

        for (char c : inputArray) {
            int tmp = c - '0';
            result += tmp * Math.pow(10, degree);
            degree--;
        }
        return result;
    }
}
