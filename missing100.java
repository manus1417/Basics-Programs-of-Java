import java.util.*;

public class missing100 {
    static int findMissing(int arr[]) {
        int total = 0;
        for (int i = 0; i < 99; i++) {
            total += arr[i];
        }
        int missing = 5050 - total;
        return missing;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[99];
        for (int i = 0; i < 99; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMissing(arr));
        sc.close();
    }
}
