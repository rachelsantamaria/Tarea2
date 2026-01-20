package StringLength;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a string ");
        String hilera = scanner.nextLine();
        int quantity = hilera.length();
        System.out.println("The quantity of characters in the string " + hilera + " is: " + quantity);
        scanner.close();
    }
}
