import java.util.*;

public class watermelon {
    static boolean evenParts(int w) {
        if (w == 2) {
            return false;
        }
        if (w % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (evenParts(w)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
