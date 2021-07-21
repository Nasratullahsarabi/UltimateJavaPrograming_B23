package statements;

import java.util.Scanner;

public class burgerOrChekin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.next();

        if (item.equals("burger") || item.equals("chicken")){
            System.out.println(10);
        }else if (item.equals("soda")){
            System.out.println(2.0);
        }else if (item.equals("fries")){
            System.out.println(3.5);
        }

        scan.close();
    }
}
