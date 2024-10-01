import java.util.Scanner;

public class ShadyRestRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("(1) Queen bed");
        System.out.println("(2) King bed");
        System.out.println("(3) Suite with a king bed and pull-out couch");
        System.out.print("Enter Selection (1, 2, or 3) >> ");
        
        int selection = input.nextInt();
        int price = 0;
        String roomType = "";
        
        switch (selection) {
            case 1:
                price = 125;
                roomType = "Queen bed";
                break;
            case 2:
                price = 139;
                roomType = "King bed";
                break;
            case 3:
                price = 165;
                roomType = "Suite with a king bed and pull-out couch";
                break;
            default:
                System.out.println("Invalid selection. Please enter 1, 2, or 3.");
                roomType = "Invalid room selection";
                price = 0;
        }
        
        System.out.println("You selected " + roomType + "  $" + price);
    }
}
