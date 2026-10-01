// File: test.java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter first integer: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int num1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int num2 = scanner.nextInt();

            // Calculate sum
            int sum = num1 + num2;

            // Display result
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
