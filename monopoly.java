import java.util.Scanner;

public class monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int sum = p + q + r + s;
            if (p > (sum - p) || q > (sum - q) || r > (sum - r) || s > (sum - s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
