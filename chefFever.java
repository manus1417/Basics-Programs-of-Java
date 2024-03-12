import java.util.*;

public class chefFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            if (arr[i] > 98) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
