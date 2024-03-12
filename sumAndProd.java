import java.util.Scanner;

public class sumAndProd {
    static void sumProd(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n = n / 10;
        }
        System.out.println(sum + " " + prod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumProd(n);
        sc.close();
    }
}
