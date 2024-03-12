import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a > b && a < c) || (a < b && a > c)) {
                System.out.println(a);
            } else if ((b > a && b < c) || (b > c && b < a)) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
            T--;
        }

        sc.close();
    }
}
