package Viikko3.T4;
import java.util.Scanner;

/* Task 5:
Steps how I (and you) can create a jar from this if you wish to test its function:

Here are the steps to create a jar file in IntelliJ IDEA:

Open your project in IntelliJ IDEA
Go to File -> Project Structure
In the "Project Structure" window, go to the "Artifacts" tab.
Click the "+" button in the top left corner and select "JAR -> From modules with dependencies".
Select the main class for the JAR file in the "Main Class" field.
In the "Output Layout" section, select the classes, resources, and other files you want to include in the JAR file.
Click "Apply" and then "OK" to close the "Project Structure" window.
Go to Build -> Build Artifacts...
Select the JAR file you want to build and click the "Build" button.
The JAR file will be created in the "out/artifacts" directory of your project.
To run the jar file, open a terminal or command prompt and navigate to the directory where the jar file is located. Run the following command:

java -jar <jar_file_name>.jar

Should work.

Or if you're for some reason using something other than IntelliJ Idea (do the switch, you'll love it)

You can do it via terminal:

Compile the Salasana.java class using the javac command:

    javac Salasana.java

This will create a Salasana.class file in the same directory.
Create a jar file from the class file using the jar command:

jar cvf Salasana.jar Salasana.class

This will create a jar file named Salasana.jar in the current directory, containing the Salasana.class file.
Run the jar file using the java command with the -cp option:

java -cp Salasana.jar Salasana

This will run the main class defined in the jar file, in this case, Salasana.
This should allow you to drive the Salasana class through the program and execute the code in the jar file.
*/

// For me the jar worked just fine, as intended.


class Salasana {
    private String sana;

    public Salasana(String sana) {
        this.sana = sana;
    }

    public boolean kelpaa() {
        int upper = 0;
        int lower = 0;
        int number = 0;
        int special = 0;
        int len = sana.length();

        if (len < 20) {
            System.out.println("Password must be at least 20 characters long.");
            return false;
        }

        for (int i = 0; i < len; i++) {
            char c = sana.charAt(i);
            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isDigit(c)) {
                number++;
            } else if (!Character.isLetterOrDigit(c)) {
                special++;
            }
        }

        if (upper == 0) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }
        if (lower == 0) {
            System.out.println("Password must contain at least one lowercase letter.");
            return false;
        }
        if (number == 0) {
            System.out.println("Password must contain at least one number.");
            return false;
        }
        if (special == 0) {
            System.out.println("Password must contain at least one special character.");
            return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Password must be at least 20 characters long,");
        System.out.println("Contain at least one uppercase letter,");
        System.out.println("Contain at least one lowercase letter,");
        System.out.println("Contain at least one number,");
        System.out.println("And contain at least one special character.");
        while (true) {
            System.out.print("Enter password: ");
            String sana = lukija.nextLine();
            Salasana salasana = new Salasana(sana);
            if (salasana.kelpaa()) {
                System.out.println("Password is valid.");
                break;
            }
        }
    }
}