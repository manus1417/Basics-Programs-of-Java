import java.util.*;

public class maxSubarray {
    static int findMaxSubarr(int arr[], int n) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxSubarr(arr, n));
        sc.close();
    }
}
