import java.util.Scanner;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int total = n * x;
            String s = String.valueOf(total);
            if (s.length() == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
