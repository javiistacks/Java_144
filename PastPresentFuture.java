
import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        
        // Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for month, day, and year
        System.out.print("Enter a month >> ");
        int month = input.nextInt();
        System.out.print("Enter a day >> ");
        int day = input.nextInt();
        System.out.print("Enter a year (four digits) >> ");
        int year = input.nextInt();
        
        // Display the appropriate message based on user input
        if (year != currentYear) {
            System.out.println(year + " is not this year");
        } else if (month < currentMonth) {
            System.out.println(month + " is in an earlier month this year");
        } else if (month > currentMonth) {
            System.out.println(month + " is in a later month this year");
        } else {
            System.out.println(month + " is this month");
        }
        
        // Close the scanner
        input.close();
    }
}
