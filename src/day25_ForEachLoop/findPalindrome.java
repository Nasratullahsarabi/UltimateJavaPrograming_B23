package day25_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class findPalindrome {
    public static void main(String[] args) {

        String[]palindrome = {"anna", "level", "java", "python"};
        String[]revers = new String[palindrome.length];
        String emelents = revers[0];

        int j = 0;
        for (int i = palindrome.length-1; i >=0 ; i--) {

            revers[j++] = palindrome[i];

        }
        System.out.println(Arrays.toString(palindrome));
        System.out.println(Arrays.toString(revers));

    }
}
/*
write a program to find how many palindromes in an array of string are
 */