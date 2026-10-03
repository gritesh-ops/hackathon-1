import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consumption = scanner.nextDouble();
        int bill;

        if (consumption <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }

        System.out.println("Water bill: Rs." + bill);

        scanner.close();
    }
}