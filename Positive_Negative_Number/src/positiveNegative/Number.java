package positiveNegative;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner
        scanner.close();
    }
}
