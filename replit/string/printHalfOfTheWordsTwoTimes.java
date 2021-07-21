package string;

import java.util.Scanner;

public class printHalfOfTheWordsTwoTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word= scan.next();
        String halfOfTheWord = word.substring(0,word.length()/2);

        System.out.println(halfOfTheWord+halfOfTheWord);

        scan.close();
    }
}
