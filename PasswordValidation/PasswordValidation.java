package PasswordValidation;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Create a password");
    String password = scanner.nextLine();
    boolean minimum = password.length() >= 8;
    boolean capitalLetter = false;
    for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                capitalLetter= true;
            }
        }

        if (minimum && capitalLetter) {
            System.out.println("The password is valid");
        } else {
            System.out.println("The password is not valid, 8 characters and a capital letter minimum");
        }
    }
    

}
