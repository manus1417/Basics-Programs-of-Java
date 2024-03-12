import java.util.*;

public class appearOnce {
    static int findOnce(int arr[], int n) {// O(n^2)
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int xor = 0;//(O(n))
        // for (int i = 0; i < n; i++) {
        // xor = xor ^ arr[i];
        // }
        // System.out.println(xor);
        System.out.println(findOnce(arr, n));

        sc.close();
    }
}
