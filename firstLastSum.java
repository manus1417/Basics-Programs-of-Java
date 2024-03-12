import java.util.Scanner;

public class firstLastSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = n / 1000;
        int last = n % 10;
        System.out.println(first + last);
        sc.close();
    }
}
