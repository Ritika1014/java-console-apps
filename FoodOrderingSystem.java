import java.util.Scanner;

class FoodOrder {

    void orderFood(String item) {
        System.out.println("Order placed for: " + item);
    }

   
    void orderFood(String item, int quantity) {
        System.out.println("Order placed for: " + item);
        System.out.println("Quantity: " + quantity);
    }

   
    void orderFood(String item, int quantity, String deliveryType) {
        System.out.println("Order placed for: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Type: " + deliveryType);
    }
}

public class FoodOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodOrder obj = new FoodOrder();

        System.out.println("---- Food Ordering System ----");
        System.out.println("1. Order single item");
        System.out.println("2. Order with quantity");
        System.out.println("3. Order with quantity and delivery type");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();
        sc.nextLine();  

        switch(choice) {
            case 1:
                System.out.print("Enter food item: ");
                String item1 = sc.nextLine();
                obj.orderFood(item1);
                break;

            case 2:
                System.out.print("Enter food item: ");
                String item2 = sc.nextLine();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                obj.orderFood(item2, qty);
                break;

            case 3:
                System.out.print("Enter food item: ");
                String item3 = sc.nextLine();
                System.out.print("Enter quantity: ");
                int qty3 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter delivery type (Home/Takeaway): ");
                String delivery = sc.nextLine();
                obj.orderFood(item3, qty3, delivery);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}