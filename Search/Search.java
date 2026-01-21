package Search;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Write a phrase ");
        String phrase = scanner.nextLine();
        System.out.println("Write a word");
        String word = scanner.nextLine();
        boolean contained = phrase.contains(word);
        System.out.println("The word "+ word + " is contained in the phrase: "+ phrase + "?:" + contained);
    }
}
