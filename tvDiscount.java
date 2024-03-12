import java.util.Scanner;

public class tvDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int tv1 = a - c;
            int tv2 = b - d;
            if (tv1 < tv2) {
                System.out.println("First");
            } else if (tv2 < tv1) {
                System.out.println("Second");
            } else if (tv2 == tv1) {
                System.out.println("Any");
            }
            T--;
        }
        sc.close();
    }
}
