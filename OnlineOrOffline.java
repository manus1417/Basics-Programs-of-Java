import java.util.Scanner;

public class OnlineOrOffline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            double o = (n - (0.1 * n));
            if (o < m) {
                System.out.println("ONLINE");
            } else if (o > m) {
                System.out.println("DINING");
            } else if (o == m) {
                System.out.println("EITHER");
            }
            t--;
        }
        sc.close();
    }
}
