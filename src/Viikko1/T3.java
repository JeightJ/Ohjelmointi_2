package Viikko1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file path
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        System.out.println("I would rather read something like Harry Potter but whatever, here we go:");

        // Initialize counters
        int lowerCase = 0, upperCase = 0, digits = 0, spaces = 0;

        try {
            // Create a FileReader object for the file
            FileReader fr = new FileReader(filePath);

            // Read the file character by character
            int i;
            while ((i = fr.read()) != -1) {
                // Convert the character to a string
                String character = String.valueOf((char) i);

                // Check if the character is a lower case letter
                if (Character.isLowerCase(i)) {
                    lowerCase++;
                }
                // Check if the character is an upper case letter
                else if (Character.isUpperCase(i)) {
                    upperCase++;
                }
                // Check if the character is a digit
                else if (Character.isDigit(i)) {
                    digits++;
                }
                // Check if the character is a space
                else if (character.equals(" ")) {
                    spaces++;
                }
            }

            // Close the FileReader
            fr.close();

            System.out.println("Lower case letters: " + lowerCase);
            System.out.println("Upper case letters: " + upperCase);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}