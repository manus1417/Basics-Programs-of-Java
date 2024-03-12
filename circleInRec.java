import java.util.Scanner;

public class circleInRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if (x - r >= 0 && y - r >= 0 && x <= w - r && y <= h - r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
