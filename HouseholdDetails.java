import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int familyMembers = scanner.nextInt();
        double waterConsumed = scanner.nextDouble();
        int houseNumber = scanner.nextInt();
        char usageStatus = scanner.next().charAt(0);

        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + usageStatus);

        scanner.close();
    }
}