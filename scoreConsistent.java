import java.util.Scanner;

public class scoreConsistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if ((c - a) >= 0 && (d - b) >= 0) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
            T--;
        }
        sc.close();
    }
}
