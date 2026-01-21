package Invert;

import java.util.Scanner;

public class Invert {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a word");
    String word = scanner.nextLine();
    StringBuilder stringBuilder = new StringBuilder(word);
    String inverted = stringBuilder.reverse().toString();
    System.out.println("The word "+word+" inverted is: "+inverted);
   } 
}
