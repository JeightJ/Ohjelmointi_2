package Viikko1;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while(repeat){
            String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            double totalSales = 0.0;
            for (String day : weekdays) {
                System.out.print("Enter amount sold on " + day + ": ");
                double dailySales = scanner.nextDouble();
                totalSales += dailySales;
            }
            System.out.println("Week's total sales: " + totalSales);
            System.out.print("Do you want to enter sales again? (yes or no): ");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("no")){
                repeat = false;
            }
        }
        scanner.close();
    }
}