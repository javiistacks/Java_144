// Define a public class named CountByFives.
// A class is like a blueprint that contains all the code for our program.
public class CountByFives {

    // Declare two constants, START and STOP, with the 'final' keyword.
    // 'final' means that these values cannot be changed once assigned.
    // 'static' means they belong to the class, not to instances of the class.
    // These constants are used as the starting and stopping points for our loop.
    public static final int START = 5; // The number we start counting from
    public static final int STOP = 500; // The number we count up to

    // The 'main' method is the entry point for any Java application.
    // When we run the program, this is the first method that gets executed.
    public static void main(String[] args) {

        // Start a 'for' loop to count numbers from START to STOP.
        // A 'for' loop is used for repeating actions a certain number of times.
        // Here, we want to count numbers from 5 to 500, going up by 5 each time.
        // 'int i = START' initializes the loop variable 'i' to 5, our starting point.
        // 'i <= STOP' is the condition that keeps the loop running as long as 'i' is 500 or less.
        // 'i += 5' increments 'i' by 5 after each loop iteration.
        for (int i = START; i <= STOP; i += 5) {

            // Print the current value of 'i' followed by a space, staying on the same line.
            // 'System.out.print()' is used to display output without a new line.
            // This will print numbers like 5, 10, 15, etc., all on one line.
            System.out.print(i + " ");
            
            // Check if 'i' is a multiple of 50 by using the modulus operator '%'.
            // If 'i % 50 == 0', it means 'i' is evenly divisible by 50 (i.e., 50, 100, 150...).
            // When 'i' is a multiple of 50, start a new line using 'System.out.println()'.
            // This makes the output more readable by breaking the line after every 50 numbers.
            if (i % 50 == 0) {
                System.out.println(); // Move to the next line
            }
        }
    }
}
