import java.util.Scanner;

public class blteam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == 1 && b == 1 && c == 0) {
                count++;
            } else if (a == 1 && b == 0 && c == 1) {
                count++;
            } else if (a == 0 && b == 1 && c == 1) {
                count++;
            } else if (a == 1 && b == 1 && c == 1) {
                count++;
            }

            n--;
        }
        System.out.println(count);
        sc.close();
    }
}
