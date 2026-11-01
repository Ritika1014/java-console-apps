import java.util.Scanner;

public class MobileRechargePlanSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mobile Recharge Plan Selector");
        System.out.println("Available Plans:");
        System.out.println("1. Basic Plan: 1GB Data, 100 Minutes, Validity 28 days - Rs. 200");
        System.out.println("2. Standard Plan: 5GB Data, 500 Minutes, Validity 28 days - Rs. 500");
        System.out.println("3. Premium Plan: Unlimited Data, Unlimited Minutes, Validity 28 days - Rs. 700");
        System.out.println("4. Exit");

        boolean exit = false;
        while (!exit) {
            System.out.print("Select a plan (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Basic Plan. Recharge successful!");
                    break;
                case 2:
                    System.out.println("You selected Standard Plan. Recharge successful!");
                    break;
                case 3:
                    System.out.println("You selected Premium Plan. Recharge successful!");
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using Mobile Recharge Plan Selector.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
        scanner.close();
    }
}
