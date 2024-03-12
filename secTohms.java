import java.util.Scanner;

public class secTohms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n / 3600;
        n = n - (h * 3600);
        int m = n / 60;
        n = n - (m * 60);
        System.out.println(h + ":" + m + ":" + n);
        sc.close();
    }
}
