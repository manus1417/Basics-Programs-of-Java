import java.math.BigInteger;
import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        boolean divby2 = n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0));
        boolean divby4 = n.mod(BigInteger.valueOf(4)).equals(BigInteger.valueOf(0));
        boolean divby8 = n.mod(BigInteger.valueOf(8)).equals(BigInteger.valueOf(0));
        System.out.println(divby2 ? "Yes" : "No");
        System.out.println(divby4 ? "Yes" : "No");
        System.out.println(divby8 ? "Yes" : "No");
        sc.close();
    }
}
