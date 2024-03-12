import java.util.*;

public class validTriangle {
    static void isTriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isTriangle(a, b, c);
        sc.close();
    }
}