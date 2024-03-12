import java.util.Scanner;

public class append3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 30000 + (n * 10) + 3;
        System.out.println(res);
        sc.close();
    }
}
