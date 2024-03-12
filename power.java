
import java.util.Scanner;

public class power {
    static void func(int a, int b) {
        long pow = 1;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        System.out.println(pow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        func(a, b);
        sc.close();
    }
}