import java.util.Scanner;

public class EvenOdd {
    
    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number >> ");
        int number = scanner.nextInt();
        
        // Call the isEven method and store the result
        boolean result = isEven(number);
        
        // Display whether the number is even or odd
        if (result) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
