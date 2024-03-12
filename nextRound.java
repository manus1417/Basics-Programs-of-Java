import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int a = 0;
        int kthScore = scores[k - 1];
        for (int i = 0; i < n; i++) {
            if (scores[i] >= kthScore && scores[i] > 0) {
                a++;
            }
        }
        System.out.println(a);
        sc.close();
    }
}
