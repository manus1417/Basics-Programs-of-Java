import java.util.Scanner;

public class multiple35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
