package Viikko2;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter a position: ");
        int position = sc.nextInt();

        naytaMerkki(input, position);
    }

    public static void naytaMerkki(String str, int pos) {
        char ch = str.charAt(pos);
        System.out.println("The character at position " + pos + " is: " + ch);
        if (Character.isLetter(ch)) {
            System.out.print("The character is a letter, ");
            if (Character.isUpperCase(ch)) {
                System.out.println("and it's uppercase.");
            } else {
                System.out.println("and it's lowercase.");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("The character is a number.");
        }
    }
}