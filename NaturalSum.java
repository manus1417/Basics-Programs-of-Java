import java.util.*;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
        sc.close();
    }
}
