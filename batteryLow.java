import java.util.Scanner;

public class batteryLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int battery = sc.nextInt();
            if (battery > 15) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            T--;
        }
        sc.close();
    }
}
