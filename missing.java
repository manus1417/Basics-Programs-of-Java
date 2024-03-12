import java.util.*;

public class missing {
    static int missingEle(int arr[], int n) {
        // int total = 0;
        // int actual = (n * (n + 1)) / 2;
        // for (int i = 0; i < n; i++) {
        // total += arr[i];
        // }
        int xor = n;
        for (int i = 0; i < n; i++) {
            xor = (xor ^ arr[i] ^ i);
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingEle(arr, n));
        sc.close();
    }
}
