import java.util.Scanner;

public class watchMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = x - y;
        y = y / 2;
        System.out.println(x + y);
        sc.close();
    }
}
