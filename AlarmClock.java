import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set alarm hour (0-23): ");
        int h = scanner.nextInt();
        System.out.print("Set alarm minute (0-59): ");
        int m = scanner.nextInt();
        LocalTime now = LocalTime.now();
        if (now.getHour() == h && now.getMinute() == m) {
            System.out.println("Alarm ringing!");
        } else {
            System.out.println("Not time yet.");
        }
        scanner.close();
    }
}
