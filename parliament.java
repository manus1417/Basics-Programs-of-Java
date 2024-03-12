import java.util.Scanner;

public class parliament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (x >= ((n + 1) / 2)) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }
}
