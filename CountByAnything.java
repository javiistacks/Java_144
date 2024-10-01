// Import the Scanner class from the 'java.util' package.
// 'Scanner' is used to take user input from the console, allowing for interactive programs.
import java.util.Scanner;

// Define a public class named CountByAnything.
public class CountByAnything {

    // The 'main' method is the entry point for this application.
    public static void main(String[] args) {
        
        // Create a new Scanner object called 'scanner' to capture user input.
        // 'System.in' means the Scanner will read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number they want to count by.
        // The 'print' method is used to display a message without moving to a new line.
        System.out.print("Enter number to count by >> ");
        
        // Read an integer from the user's input and store it in the variable 'countBy'.
        // 'nextInt()' is a method of Scanner that reads the next integer from the console.
        int countBy = scanner.nextInt();
        
        // Define a constant variable 'STOP' which is the maximum number we count to.
        final int STOP = 500;

        // Initialize a counter variable 'count' to zero.
        // This variable will be used to keep track of how many numbers have been printed on the current line.
        int count = 0;

        // Start a 'for' loop to count from 'countBy' up to 'STOP', increasing by 'countBy' each time.
        // For example, if the user entered '7', the loop will count 7, 14, 21, etc.
        for (int i = countBy; i <= STOP; i += countBy) {
            
            // Print the current value of 'i' followed by a space, staying on the same line.
            System.out.print(i + " ");
            
            // Increment the 'count' variable by 1 for each printed number.
            count++;

            // Every time 'count' is a multiple of 10, move to a new line.
            // This means after printing 10 numbers, a new line is started to improve readability.
            if (count % 10 == 0) {
                System.out.println(); // Move to the next line
            }
        }
        
        // Close the Scanner object to free up resources.
        // It's good practice to close scanners when done to prevent potential resource leaks.
        scanner.close();
    }
}
