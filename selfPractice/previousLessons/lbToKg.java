package previousLessons;

public class lbToKg {
    public static void main(String[] args) {
        int a = 4,  b = 4; int y = 30; int c = 3;

        a = b;
        b = a;
        y = (a+(b++))/c;

        System.out.println(y);
        System.out.println(b+a);

    }
}
