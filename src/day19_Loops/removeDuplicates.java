package day19_Loops;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result  = ""; // after first if the result will look like this "a"

        if (word.length() == 5) {
            if (!result.contains("" + word.charAt(0))) {
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(1))) {
                result += word.charAt(1);
            }
            if (!result.contains("" + word.charAt(2))) {
                result += word.charAt(2);
            }
            if (!result.contains("" + word.charAt(3))) {
                result += word.charAt(3);
            }
            if (!result.contains("" + word.charAt(4))) {
                result += word.charAt(4);
            }

        }else if (word.length() > 5){
            result = "too long";
        }else {
            result = "too short";
        }
        System.out.println("result = " + result);

        scan.close();

    }
}
/*
ask the user to enter a word. the word must be five characters long and print the word without the duplicated characters,
but if the word is less than five characters long, print "Too Short." and if the word is more than five characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
 */