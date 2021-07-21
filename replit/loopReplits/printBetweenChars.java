package loopReplits;

import java.util.Scanner;

public class printBetweenChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ltr1 = scan.next().charAt(0);
        char ltr2 = scan.next().charAt(0);

        for (char i = ltr1; i <=ltr2 ; i++) {
            System.out.print(i+" ");

        }
    }
}
