import java.util.Scanner;

public class chefandcandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (N >= X) {
                if ((N - X) % 4 == 0) {
                    System.out.println((N - X) / 4);
                } else {
                    System.out.println((N - X) / 4 + 1);
                }

            } else {
                System.out.println("0");
            }
            T--;
        }
        sc.close();
    }
}
