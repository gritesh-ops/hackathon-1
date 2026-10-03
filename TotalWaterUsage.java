import java.util.Scanner;

public class TotalWaterUsage {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int morning = scanner.nextInt();
        int evening = scanner.nextInt();

        int totalUsage = calculateTotal(morning, evening);

        System.out.println("Total water consumption: " + totalUsage + " litres");

        scanner.close();
    }
}