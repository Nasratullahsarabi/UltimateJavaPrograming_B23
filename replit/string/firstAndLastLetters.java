package string;

import java.util.Scanner;

public class firstAndLastLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        char first = word.charAt(0);
        char last = word.charAt(4);

        String firstAndLast = first+""+last;

        System.out.println(firstAndLast);
        scan.close();

    }
}
