import java.util.Scanner;

public class divisors {
    static int count(int a, int b, int c) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = count(a, b, c);
        System.out.println(res);
        sc.close();
    }
}
