package Counter;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a string of characters ");
        String stringOfCharacters = scanner.nextLine();
        int counter = 0;
        for(int i=0;i<stringOfCharacters.length();i++) {
        if ((stringOfCharacters.charAt(i)=='a') || (stringOfCharacters.charAt(i)=='e') 
        ||(stringOfCharacters.charAt(i)=='i') || (stringOfCharacters.charAt(i)=='o') 
        || (stringOfCharacters.charAt(i)=='u')){
        counter++;
        }
        } 
        System.out.println(" The string of characters contains: " + counter + " vocals");
    }
}
