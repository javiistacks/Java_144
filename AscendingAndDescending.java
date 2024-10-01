

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for three integers
        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        System.out.print("And another: ");
        int num2 = scanner.nextInt();
        System.out.print("And just one more: ");
        int num3 = scanner.nextInt();
        
        // Store the integers in an array
        int[] numbers = {num1, num2, num3};
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Display the numbers in ascending order
        System.out.print("Ascending: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Display the numbers in descending order
        System.out.print("Descending: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Close the scanner
        scanner.close();
    }
}
