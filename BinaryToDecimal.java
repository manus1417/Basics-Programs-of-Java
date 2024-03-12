import java.util.*;

public class BinaryToDecimal {
	static int binToDec(int n) {
		int val = 0;
		int base = 1;
		while (n > 0) {
			int l = n % 10;
			val += l * base;
			n /= 10;
			base *= 2;
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bi = sc.nextInt();
		System.out.println(binToDec(bi));
		sc.close();
	}

}
