import java.util.Scanner;

public class swapMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0)
                break;
            if (x <= y) {
                System.out.println(x + " " + y);
            } else if (x > y) {
                System.out.println(y + " " + x);
            }

        }
        sc.close();
    }
}
