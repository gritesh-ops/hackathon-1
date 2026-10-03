import java.util.Scanner;

public class Main {

    // 1c) Method to calculate total water consumption
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1a) Data Types ---
        System.out.print("Enter number of family members: ");
        int familyMembers = scanner.nextInt();

        System.out.print("Enter water consumed (litres): ");
        double waterConsumed = scanner.nextDouble();

        System.out.print("Enter house number: ");
        int houseNumber = scanner.nextInt();

        System.out.print("Enter water usage status: ");
        char usageStatus = scanner.next().charAt(0);

        System.out.println("\n--- Household Details ---");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);

        // --- 1b) If-Else Condition ---
        System.out.print("\nEnter water consumption for billing: ");
        double consumption = scanner.nextDouble();
        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("Water bill: Rs." + bill);

        // --- 1c) Methods ---
        System.out.print("\nEnter morning water usage: ");
        int morning = scanner.nextInt();

        System.out.print("Enter evening water usage: ");
        int evening = scanner.nextInt();

        int totalUsage = calculateTotal(morning, evening);
        System.out.println("Total water consumption: " + totalUsage + " litres");

        scanner.close();
    }
}