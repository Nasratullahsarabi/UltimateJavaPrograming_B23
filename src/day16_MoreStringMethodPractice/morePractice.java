package day16_MoreStringMethodPractice;

import java.util.Scanner;

public class morePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");

        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.length() >= 2 && word2.length() >= 2){
            String newWord1 = word1.substring(1) + word2.substring(1);
        }else {
            System.out.println("too short");
        }





    }

}

/*
Ask user to enter two words. Print first word without its first character then
print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
