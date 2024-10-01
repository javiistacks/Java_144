import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for a starting day
        System.out.print("From what day do you want to start the song The Twelve Days of Christmas? >> ");
        int choice = input.nextInt();

        // Determine the suffix for the day
        String suffix;
        if (choice >= 4) {
            suffix = "th";
        } else if (choice == 3) {
            suffix = "rd";
        } else if (choice == 2) {
            suffix = "nd";
        } else {
            suffix = "st";
        }

        // Display the intro of the song
        System.out.println("On the " + choice + suffix + " day of Christmas");
        System.out.println("My true love gave to me");

        // Use a switch statement to handle each day's gifts
        switch (choice) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and"); // Ensure the "and" is included for day 2
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
        }

        // Close the scanner
        input.close();
    }
}
