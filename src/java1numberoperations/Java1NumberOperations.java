
package java1numberoperations;
// Importing the Scanner class to read user input
import java.util.Scanner;
/**
 *
 * @author jhane
 */
public class Java1NumberOperations {

    /**
     * @param args the command line arguments
     */
    // Main method - this is the entry point of the program
    // Main method - this is the entry point of the program
    public static void main(String[] args) {
        
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Boolean variable to control the loop (whether to keep asking for numbers)
        boolean continueLoop;
        
        // Do-while loop that will run at least once
        do {
            // Friendly message to start the process
            System.out.println("Let's perform some calculations! You'll be asked to input two numbers.");

            // Prompt the user to enter the first number
            System.out.print("Please enter the first number: ");
            double firstNumber = getValidNumber(scanner);
            
            // Prompt the user to enter the second number
            System.out.print("Please enter the second number: ");
            double secondNumber = getValidNumber(scanner);

            // Performing arithmetic operations
            double sum = firstNumber + secondNumber; // Sum
            double difference = firstNumber - secondNumber; // Subtraction
            double product = firstNumber * secondNumber; // Multiplication
            double quotient; // Division result
            
            // Check to avoid division by zero
            if (secondNumber != 0) {
                quotient = firstNumber / secondNumber; // Division
            } else {
                quotient = Double.NaN; // Assign NaN if division by zero
            }

            // Outputting the results
            System.out.printf("The sum of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, sum);
            System.out.printf("The difference of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, difference);
            System.out.printf("The product of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, product);
            
            // Check if the second number is not zero before printing the quotient
            if (secondNumber != 0) {
                System.out.printf("The quotient of %.2f and %.2f is %.2f%n", firstNumber, secondNumber, quotient);
            } else {
                System.out.println("Division by zero is not allowed.");
            }

            // Ask the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? Press 'yes' to continue, or press any other key to exit: ");
            String response = scanner.next();

            // Continue the loop if the user responds with "yes"
            continueLoop = response.equalsIgnoreCase("yes");

            // Friendly message to signal end of calculation
            if (!continueLoop) {
                System.out.println("Thank you for using the calculator! Goodbye.");
            }

        } while (continueLoop); // Repeat the loop based on user input

        // Closing the scanner to free resources
        scanner.close();
    }

    // Method to get a valid number input from the user
    public static double getValidNumber(Scanner scanner) {
        while (true) {
            // Try to read a double input
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble(); // Return the valid number
            } else {
                // If the input is invalid, print an error message
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}