import java.util.Scanner;

public class nextEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println(n + 2);
        } else {
            System.out.println(n + 1);
        }
        sc.close();
    }
}
