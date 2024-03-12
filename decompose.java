import java.util.Scanner;

public class decompose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = Math.abs(n) / 100;
        int t = Math.abs(n % 100) / 10;
        int o = Math.abs(n) % 10;
        System.out.println(h);
        System.out.println(t);
        System.out.println(o);
        sc.close();
    }
}
