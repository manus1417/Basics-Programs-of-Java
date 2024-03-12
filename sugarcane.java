import java.util.Scanner;

public class sugarcane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int coins = a * 50;
            int s = (int) (0.2 * coins);
            int sm = (int) (0.2 * coins);
            int r = (int) (0.3 * coins);
            int p = coins - (s + sm + r);
            System.out.println(p);
            T--;
        }
        sc.close();
    }
}
