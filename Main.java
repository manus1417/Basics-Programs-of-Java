import java.util.*;
//import java.io.*;

public class Main {
    static Long area(Long l, Long b) {
        return l * b;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        Long L = sc.nextLong();
        Long B = sc.nextLong();
        System.out.println(area(L, B));
        sc.close();
    }
}
