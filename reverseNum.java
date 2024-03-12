import java.util.*;

public class reverseNum {
    static Long reverse(Long n) {
        Long rev = (long) (0);
        while (n != 0) {
            Long r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        Long rev = reverse(num);
        System.out.println(rev);
        sc.close();
    }
}
