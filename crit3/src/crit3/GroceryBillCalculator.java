package crit3;
import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for coupon amount
        System.out.print("Enter the coupon amount as a decimal (e.g., 0.10): ");
        double couponAmount = scanner.nextDouble();

        // Validate coupon amount
        if (couponAmount <= 0 || couponAmount > 1) {
            System.out.println("Invalid coupon amount. Setting coupon to 10%.");
            couponAmount = 0.10;
        }

        // Prompt for weekly grocery bills
        double[] weeklyBills = new double[4];
        double monthlyTotal = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter grocery bill for week " + (i + 1) + ": ");
            weeklyBills[i] = scanner.nextDouble();
            monthlyTotal += weeklyBills[i];
        }

        // Calculate averages
        double weeklyAverage = monthlyTotal / 4;

        // Apply coupon
        double discountedMonthlyTotal = monthlyTotal * (1 - couponAmount);
        double discountedWeeklyAverage = discountedMonthlyTotal / 4;

        // Display results
        System.out.println("\n--- Grocery Bill Summary ---");
        System.out.printf("Monthly Total (without coupon): $%.2f%n", monthlyTotal);
        System.out.printf("Weekly Average (without coupon): $%.2f%n", weeklyAverage);
        System.out.printf("Monthly Total (with coupon): $%.2f%n", discountedMonthlyTotal);
        System.out.printf("Weekly Average (with coupon): $%.2f%n", discountedWeeklyAverage);

        scanner.close();
    }
}
