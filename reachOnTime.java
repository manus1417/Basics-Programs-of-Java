import java.util.Scanner;

public class reachOnTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            if (x - 30 >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }
}
