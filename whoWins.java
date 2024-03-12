import java.util.Scanner;

public class whoWins {
    public static String gameWinner(int X, int Y) {
        for (int i = 0; i < Y; i++) {
            if (i % 2 == 0) {
                X += 1;
            } else {
                X -= 1;
            }
        }
        if (X % 2 == 0) {
            return "Janmansh";
        } else {
            return "Jay";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int aa = sc.nextInt();
            int bb = sc.nextInt();
            System.out.println(gameWinner(aa, bb));
        }
        sc.close();
    }
}
