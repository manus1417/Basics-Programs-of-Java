import java.util.Scanner;

public class areaAndPerimeter {
    static int area(int a, int b) {
        return a * b;
    }

    static int perimeter(int a, int b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = area(a, b);
        int per = perimeter(a, b);
        System.out.println(area + " " + per);
        sc.close();
    }
}
