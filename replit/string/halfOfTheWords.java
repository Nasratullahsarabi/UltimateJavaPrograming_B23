package string;

import java.util.Scanner;

public class halfOfTheWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int firstHalf = word.length()/2;

        System.out.println(word.charAt(firstHalf-1)+""+word.charAt(firstHalf));

        scan.close();

    }
}
