package day19_Loops;

import java.util.Scanner;

public class palinderome {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next(); String reverseWord = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reverseWord += word.charAt(i);
        }
        boolean isPalinderome = word.equalsIgnoreCase(reverseWord);
        System.out.println(isPalinderome);
        System.out.println();
        System.out.println("================================");


        if (isPalinderome){
            System.out.println(word+" is palindrome");
        }else {
            System.out.println(word+" is not palindrome");
        }
    }
}
