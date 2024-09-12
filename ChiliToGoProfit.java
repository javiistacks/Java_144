import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Constants for meal prices and production costs
        final double ADULT_MEAL_PRICE = 7.0;
        final double CHILD_MEAL_PRICE = 4.0;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Input for number of meals ordered
        System.out.print("Enter number of adult meals ordered >> ");
        int adultMeals = input.nextInt();
        System.out.print("Enter number of child meals ordered >> ");
        int childMeals = input.nextInt();

        // Calculate total costs and profits
        double adultTotal = adultMeals * ADULT_MEAL_PRICE;
        double childTotal = childMeals * CHILD_MEAL_PRICE;
        double grandTotal = adultTotal + childTotal;

        double adultProfit = (ADULT_MEAL_PRICE - ADULT_MEAL_COST) * adultMeals;
        double childProfit = (CHILD_MEAL_PRICE - CHILD_MEAL_COST) * childMeals;
        double totalProfit = adultProfit + childProfit;

        // Display results
        System.out.println(adultMeals + " adult meals were ordered at $" + ADULT_MEAL_PRICE + " each.");
        System.out.println("      Total is $" + adultTotal);
        System.out.println(childMeals + " child meals were ordered at $" + CHILD_MEAL_PRICE + " each.");
        System.out.println("      Total is $" + childTotal);
        System.out.println("Grand total for all meals is $" + grandTotal);
        
        // Display profits
        System.out.println("Profits:");
        System.out.println("      Adult profit is $" + adultProfit);
        System.out.println("      Child profit is $" + childProfit);
        System.out.println("Total profit is $" + totalProfit);
    }
}
