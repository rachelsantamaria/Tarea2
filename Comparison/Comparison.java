package Comparison;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a string of characters ");
        String firstString = scanner.nextLine();
        System.out.println(" Write another string of characters ");
        String secondString = scanner.nextLine();

        boolean areEquals = firstString.equalsIgnoreCase(secondString);
        System.out.println("The strings are equals?: " + areEquals);
    }
}
