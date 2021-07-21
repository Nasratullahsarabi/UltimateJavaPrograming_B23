package pr1;

public class preAndPostUnarries {
    public static void main(String[] args) {
        int a = 50;
         a = --a + a++ + a-- +a++;
         /*
         a = 49 + 49 + 50 + 49;
         a = 197;

          */

         int x = 4;
         int y = x * 4 - x++;
         /*
         y = 16 - 4;
         y = 12;

          */

        System.out.println(a);
        System.out.println(y);
    }
}
