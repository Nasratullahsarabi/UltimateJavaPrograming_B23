package day18_StringPractice;

import java.util.Scanner;

public class degitletterOrChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        /*
        char f = word.charAt(0);
        if (f>='0' && f<= '9'){
            System.out.println("first character is a digit");
        }else if (f >= 'a' && f <= 'z'){
            System.out.println("first character is lower case");
        }else if (f>= 'A' && f <= 'Z'){
            System.out.println("first character is upper case");
        }else {
            System.out.println("The first character is special character");
        }

         */
/*
        char f = word.charAt(0); String result = "first character is";
        result = (f >= 0 && f <= 9)?"digit":(f >= 'a' && f <= 'z')?"lower case":(
                f >= 'A' && f <= 'Z')?"upper case":"special character";

        System.out.println(result);

 */




        scan.close();
    }
}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
 */