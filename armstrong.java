import java.util.Scanner;

public class armstrong {
    static int arm(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = arm(n);
        if (sum == temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();

    }
}
