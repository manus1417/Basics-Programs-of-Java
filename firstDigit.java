import java.util.Scanner;

public class firstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        n = Math.abs(n);
        while (n >= 10) {
            n /= 10;
        }
        System.out.println(n);
        sc.close();
    }
}
