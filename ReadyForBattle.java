import java.util.Scanner;

public class ReadyForBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lucky = 0;
        int unlucky = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                lucky++;
            } else {
                unlucky++;
            }
        }
        if (lucky > unlucky) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
        sc.close();
    }
}
