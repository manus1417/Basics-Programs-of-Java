import java.util.Scanner;

public class pizzaSharing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int pieces = a * b;
            if (pieces % 4 == 0) {
                System.out.println(pieces / 4);
            } else {
                System.out.println(pieces / 4 + 1);
            }
            T--;
        }
        sc.close();
    }
}
