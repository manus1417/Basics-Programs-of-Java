import java.util.Scanner;

public class leftRightSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = n / 1000;
        int l = n % 10;
        n = n - (f * 1000) - l;
        n = n + (l * 1000) + f;
        System.out.println(n);
        sc.close();
    }
}
