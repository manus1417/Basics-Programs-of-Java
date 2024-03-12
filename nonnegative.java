import java.util.Scanner;

public class nonnegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int negativeCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < N; i++) {
                int num = scanner.nextInt();
                if (num < 0) {
                    negativeCount++;
                } else if (num == 0) {
                    zeroCount++;
                }
            }
            int removeCount = 0;
            if (negativeCount % 2 == 1) {
                if (zeroCount > 0) {
                    removeCount = 0;
                } else {
                    removeCount = 1;
                }
            }
            System.out.println(removeCount);
        }
        scanner.close();
    }
}
