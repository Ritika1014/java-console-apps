import java.util.Scanner;

public class Password_Validation {
    public static void main(String[] args) {

        String Password = "demo-password";
        int chances = 3;

        Scanner obj = new Scanner(System.in);
        System.out.println("========== Password Validation System ==========");

        int i = 1;
        while (i <= chances) {

            System.out.print("Enter Password: ");
            String trial = obj.nextLine();

            if (Password.equals(trial)) {
                System.out.println("Password Validated");
                break;
            } else {
                System.out.println("Try again! You have " + (chances - i) + " chances left.");
            }

            i++;
        }

        obj.close();
    }
}
