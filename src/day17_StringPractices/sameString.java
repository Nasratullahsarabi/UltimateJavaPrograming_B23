package day17_StringPractices;

import java.util.Scanner;

public class sameString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = scan.next();
        /*
        String firstL = word1.substring(0,1);
        String lastL = word1.substring(word1.length()-1);

        if (firstL.equalsIgnoreCase(lastL)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

         */

        String firstL = word1.substring(0,1).toLowerCase();
        String lastL = word1.substring(word1.length()-1).toLowerCase();

        if (firstL.equals(lastL)){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }








        scan.close();
    }

}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */