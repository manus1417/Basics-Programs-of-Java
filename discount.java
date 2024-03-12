import java.util.*;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            int amount = 100 - arr[i];
            System.out.println(amount);
        }
        sc.close();
    }
}
