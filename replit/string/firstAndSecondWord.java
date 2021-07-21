package string;

import java.util.Scanner;

public class firstAndSecondWord {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        System.out.println(word1+word2+word2+word1);

        scan.close();
    }
}
