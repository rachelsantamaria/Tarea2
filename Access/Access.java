package Access;
import java.util.Scanner;
public class Access {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Write a word ");
        String word = scanner.nextLine();
        System.out.println("The first character of the word is: " + word.charAt(0));
        System.out.println("The last character of the word is: " + word.charAt(word.length()-1));
    }
}
