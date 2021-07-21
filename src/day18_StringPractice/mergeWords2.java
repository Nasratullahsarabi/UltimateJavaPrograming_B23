package day18_StringPractice;

import java.util.Locale;
import java.util.Scanner;

public class mergeWords2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();
        /*
        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }else {
            System.out.println(word1+word2);
        }

         */
/*
        if (word1.substring(word1.length()-1).equalsIgnoreCase(word2.substring(0,1))){
            System.out.println(word1+word2.substring(1));
        }

 */

        if (word1.toLowerCase().endsWith(word2.substring(0,1).toLowerCase())){
            System.out.println(word1+word2.substring(1));
        }



        scan.close();
    }
}
/*
Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
