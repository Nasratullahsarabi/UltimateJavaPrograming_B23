package day06_UnaryOperators;

public class postPrePractice {
    public static void main(String[] args) {
        int a = 100;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);
        int c = 100;
        int d = c++;
        System.out.println(d);
        System.out.println(c);
        int e =1;
        e= -e-- + e++ / -e-- * --e;
        /*
        e = 0 + -1 / 0 * 0;
        e = -1 + -0
        e = - 1
         */
        System.out.println(e);
        int x = 10;
        x = ++x - x-- + x++ + --x;
        System.out.println(x);
        int y = 50;
        int z = -y++ + --y - ++y + y--;
        System.out.println(y);
        System.out.println(z);
    }
}
