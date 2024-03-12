import java.util.Scanner;

public class theatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long rows = (n + a - 1) / a; // ceil(n/a)
        long cols = (m + a - 1) / a; // ceil(m/a)
        long totalFlagstones = rows * cols;
        System.out.println(totalFlagstones);
        sc.close();
    }
}
