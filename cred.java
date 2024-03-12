import java.util.Scanner;

public class cred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 750) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
