import java.util.Scanner;

public class compartmentWeights {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            long[] weights = new long[N];
            for (int i = 0; i < N; i++) {
                weights[i] = scan.nextLong();
            }
            int Q = scan.nextInt();
            for (int q = 0; q < Q; q++) {
                int start = scan.nextInt() - 1;
                int end = scan.nextInt() - 1;
                long weight = scan.nextLong();
                for (int i = start; i <= end; i++) {
                    weights[i] += weight;
                }
            }
            long totalWeight = 0;
            for (int i = 0; i < N; i++) {
                totalWeight += weights[i];
            }
            System.out.println(totalWeight);
        }
        scan.close();
    }
}
