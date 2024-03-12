import java.util.*;

public class helpchef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            if (n < 10) {
                System.out.println("Thanks for helping Chef!");
            } else {
                System.out.println("-1");
            }
            T--;
        }
        sc.close();
    }
}
