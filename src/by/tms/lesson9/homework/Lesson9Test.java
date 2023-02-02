package by.tms.lesson9.homework;

import by.tms.lesson9.homework.utils.StringUtils;

import java.util.Scanner;

import static by.tms.lesson9.homework.utils.CreateArray.getCharArray;
import static by.tms.lesson9.homework.utils.StringUtils.print;

public class Lesson9Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*********** MENU *************");
            System.out.println("1. Task_1");
            System.out.println("2. Task_2");
            System.out.println("3. Task_3");
            System.out.println("4. Task_4");
            System.out.println("5. Task_5");
            System.out.println("0. Exit");
            System.out.println("******************************");
            System.out.print("Input task number (0 for exit): ");

            int key = scanner.nextInt();
            char[] tmpArray;

            switch (key) {
                case 1 -> {
                    System.out.print("Input string: ");
                    tmpArray = getCharArray();
                    System.out.println("String without \\n:");
                    print(tmpArray);
                    System.out.println("\nString with \\n:");
                    StringUtils.println(tmpArray);
                    System.out.println("Next row.");
                }
                case 2 -> {
                    System.out.print("Input string: ");
                    tmpArray = getCharArray();
                    System.out.print("Are input string [");
                    print(tmpArray);
                    System.out.println("] is blank? -> " + StringUtils.isBlank(tmpArray) + "\n");
                }
                case 3 -> {
                    System.out.print("Input string: ");
                    tmpArray = getCharArray();
                    System.out.print("Are input string [");
                    print(tmpArray);
                    System.out.println("] is Russian? -> " + StringUtils.isRussian(tmpArray) + "\n");
                }
                case 4 -> {
                    System.out.println("Input first string");
                    tmpArray = getCharArray();
                    System.out.println("Creat second string");
                    char[] tmpArray2 = getCharArray();
                    System.out.print("Is string [");
                    StringUtils.print(tmpArray);
                    System.out.print("] contains string [");
                    print(tmpArray2);
                    System.out.println("] ? -> " + StringUtils.contains(tmpArray, tmpArray2) + "\n");
                }
                case 5 -> {
                    System.out.println("Input string, that contains only numbers: ");
                    tmpArray = getCharArray();
                    System.out.println(StringUtils.parseInt(tmpArray));
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("See you!!!");
                    return;
                }
                default -> System.out.println("Wrong key!!!");
            }
        } while (true);
    }
}
