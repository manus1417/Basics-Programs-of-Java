import java.util.Scanner;

public class narcissistic {
    static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + (count(n / 10));
    }

    static boolean nar(int n) {
        int c = count(n);
        int num = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += Math.pow(r, c);
            n /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (nar(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
