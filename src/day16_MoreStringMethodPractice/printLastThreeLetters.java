package day16_MoreStringMethodPractice;

import java.util.Scanner;

public class printLastThreeLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); String result = "";

        System.out.println("Enter a string");

        String word = scan.nextLine();
        /*
        if (word.length() == 0){
            result = "String is empty";
        }else if (word.length()>3){
            result = word.substring(word.length()-3);
        }else {
            result = word;
        }
        System.out.println(result);

         */

        result = (word.length() == 0)?"String is empty":(word.length()>3)? word.substring(word.length()-3):word;



        scan.close();
    }
}

/*
write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
