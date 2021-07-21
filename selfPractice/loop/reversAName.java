package loop;

import java.util.Scanner;

public class reversAName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        for (int i = name.length()-1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));

        }
        String car = scan.next();
        for (int i = car.length()-1;i >=0;i--){
            System.out.print(car.charAt(i));
        }
    }
}
