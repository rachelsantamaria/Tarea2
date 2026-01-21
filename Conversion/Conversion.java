package Conversion;

import java.util.Scanner;


public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a phrase ");
        String phrase = scanner.nextLine();
        System.out.println("The original phrase is: " + phrase);
        System.out.println("The phrase in upper case: " + phrase.toUpperCase());  
        System.out.println("The phrase in lower case: " + phrase.toLowerCase());
    }
    
}
