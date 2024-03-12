import java.util.Scanner;

public class course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int f = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if ((m - k) >= f) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }
}
