import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("WITH TEMP");
        System.out.print(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("XOR");
        System.out.print(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("WITH + AND -");
        System.out.print(a + " " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("WITH * AND /");
        System.out.print(a + " " + b);
        sc.close();
    }
}
