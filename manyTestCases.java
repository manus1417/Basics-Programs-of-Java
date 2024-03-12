import java.util.Scanner;

public class manyTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNumber = 1;
        int x;
        while (true) {
            x = sc.nextInt();
            if (x == 0)
                break;
            System.out.println("Case " + caseNumber + ": " + x);
            caseNumber++;
        }
        sc.close();
    }
}
