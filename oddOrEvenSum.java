import java.util.Scanner;

public class oddOrEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int l = sc.nextInt();
        if (l % 2 == 0) {
            for (int i = 0; i <= l; i = i + 2) {
                sum += arr[i];
            }
        } else {
            for (int i = 1; i <= l; i = i + 2) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
