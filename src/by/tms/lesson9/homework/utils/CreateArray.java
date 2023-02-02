package by.tms.lesson9.homework.utils;

import java.util.Scanner;

public class CreateArray {

    public static char[] getCharArray() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }
}
