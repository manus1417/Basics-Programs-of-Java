public class increment {
    public static void main(String[] args) {
        int a = 5;
        // a++;// 6
        // System.out.println(a);// 6
        // System.out.println(a++);// 6 a=7
        // System.out.println(++a);// 8
        // System.out.println(a--);//8 a=7
        // System.out.println(--a);//6
        int b = ++a + ++a;
        System.out.println(b);
        int c = --a + --a;
        int d = a++ + a++;
        System.out.println(c);
        System.out.println(d);
    }
}
