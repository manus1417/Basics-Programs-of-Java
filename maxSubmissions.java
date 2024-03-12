import java.util.Scanner;

public class maxSubmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            int time = (x * 60) / 30;
            System.out.println(time);
            t--;
        }
        sc.close();
    }
}
