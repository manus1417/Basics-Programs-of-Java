import java.util.Scanner;

public class wordAbbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String s = sc.next();
            if (s.length() > 10) {
                String res = "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
                System.out.println(res);
            } else {
                System.out.println(s);
            }
            n--;
        }
        sc.close();
    }
}
