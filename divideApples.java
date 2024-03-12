import java.util.*;

public class divideApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = k % n;
        System.out.println(res);
        sc.close();
    }
}
