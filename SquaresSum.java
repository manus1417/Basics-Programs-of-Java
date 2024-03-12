import java.util.Scanner;

public class SquaresSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        System.out.println((a * a) + (b * b));
        sc.close();
    }
}
