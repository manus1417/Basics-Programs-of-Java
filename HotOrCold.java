import java.util.*;

public class HotOrCold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < T; i++) {
            if (arr[i] > 20) {
                System.out.println("HOT");
            } else {
                System.out.println("COLD");
            }
        }
        sc.close();
    }
}
