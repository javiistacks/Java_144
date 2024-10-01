import java.util.Scanner;  // Importing the Scanner class to take user input

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creating a Scanner object to read input from the user
        
        // Display the menu options for bed selection
        System.out.println("Menu");
        System.out.println("(1) Queen bed");
        System.out.println("(2) King bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");
        System.out.print("Enter Selection (1, 2, or 3) >> ");
        
        // Read the user's bed selection
        int selection = input.nextInt();
        int price = 0;  // Variable to store the room price
        String roomType = "";  // Variable to store the type of room the user selects
        
        // Determine the price and room type based on the user's selection
        if (selection == 1) {
            price = 125;  // Set price for Queen bed
            roomType = "Queen bed";  // Set room type as Queen bed
        } else if (selection == 2) {
            price = 139;  // Set price for King bed
            roomType = "King bed";  // Set room type as King bed
        } else if (selection == 3) {
            price = 165;  // Set price for Suite (King bed with pull-out couch)
            roomType = "Suite with a king bed and pull-out couch";
        } else {
            // If an invalid bed option is entered, notify the user and set price to 0
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
            roomType = "Invalid room selection";
            price = 0;  // Set price to 0 for invalid selections
        }
        
        // If a valid room was selected (i.e., price > 0), prompt the user to select a view
        if (price > 0) {
            System.out.println("Please choose a view:");
            System.out.println("(1) a lake");
            System.out.println("(2) a park");
            System.out.print("Enter Selection (1 or 2) >> ");
            
            // Read the user's view selection
            int viewSelection = input.nextInt();
            
            // Determine the view based on the user's selection
            if (viewSelection == 1) {
                price += 15;  // Add $15 to the price for a lake view
                roomType += " with a lake view";  // Update room type to include lake view
            } else if (viewSelection == 2) {
                roomType += " with a park view";  // Update room type to include park view (no extra charge)
            } else {
                // If an invalid view option is entered, assume lake view and add $15 to the price
                System.out.println("Invalid view selection. Assuming lake view.");
                price += 15;
                roomType += " with a lake view";
            }
        }
        
        // Display the final room type and total price based on the user's selections
        System.out.println("You selected " + roomType + " for $" + price);
    }
}
