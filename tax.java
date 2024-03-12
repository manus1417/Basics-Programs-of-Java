import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            if (a > 100) {
                System.out.println(a - 10);
            } else {
                System.out.println(a);
            }
            t--;
        }
        sc.close();
    }
}
