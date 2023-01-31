package Viikko1;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int currentTotal = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            int userInput = scanner.nextInt();

            if (userInput < 0) {
                break;
            }

            currentTotal += userInput;
            System.out.println("Current total: " + currentTotal);
        }

        System.out.println("Final total: " + currentTotal);
    }
}