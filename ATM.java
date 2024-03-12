import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        Double balance = sc.nextDouble();
        if (w % 5 == 0) {
            if (w + 0.5 <= balance) {
                balance = balance - w - 0.50;
                System.out.println(String.format("%.2f", balance));
            } else {
                System.out.println(String.format("%.2f", balance));
            }
        } else {
            System.out.println(String.format("%.2f", balance));
        }
        sc.close();
    }
}
