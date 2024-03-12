import java.util.Scanner;

public class greaterAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double avg = (a + b) / 2;
            if ((a + b) % 2 != 0) {
                avg = avg + 0.5;
            }
            if (avg > c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }
}
