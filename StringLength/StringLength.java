package StringLength;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a string of characters ");
        String stringOfCharacters = scanner.nextLine();
        int quantity = stringOfCharacters.length();
        System.out.println("The quantity of characters in the string " + stringOfCharacters + " is: " + quantity);
        scanner.close();
    }
}
