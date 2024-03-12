import java.util.Scanner;

public class twoFromFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n / 1000;
        int last = n % 10;
        int res = (n - (first * 1000) - last) / 10;
        System.out.println(res);
        sc.close();
    }
}
