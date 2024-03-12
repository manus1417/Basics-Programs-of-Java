import java.util.*;

public class CubeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = ((n * n) * ((n + 1) * (n + 1))) / 4;
        System.out.println(sum);
        sc.close();
    }
}
