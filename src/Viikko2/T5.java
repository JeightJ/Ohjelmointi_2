package Viikko2;

import java.util.regex.*;
import java.util.Scanner;

public class T5 {
    public static boolean tutkiSalasana(String salasana) {

        if (salasana.length() < 20) {
            return false;
        }


        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{20,}$";
        return Pattern.matches(pattern, salasana);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a password: ");
        String salasana = scanner.nextLine();


        boolean kelvollinen = tutkiSalasana(salasana);


        if (kelvollinen) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid. It must be at least 20 characters long and contain at least one upper case letter, one lower case letter, one number and one special character.");
        }
    }
}