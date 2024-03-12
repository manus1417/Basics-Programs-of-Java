import java.util.Scanner;

public class miamiGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if ((1.07 * x) >= y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T--;
        }
        sc.close();
    }
}
