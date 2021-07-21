package stringMethod;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String word = scan.next();

        if (word.length()<1){
            System.out.println("it can't be empty");
        }else if (word.length()<2){
            System.out.println(word);
        }else{
            System.out.println(word.substring(0,2));// or System.out.println(word.charAt(0)+""+word.charAt(1));
        }
        scan.close();

    }
}
/*
  2.Given a string, return the string made of its first two chars, so
  the String "Hello" yields "He". If the string is shorter than length 2,
  return whatever there is, so "X" yields "X", and the empty string ""
  yields the empty string "".

                    Input :"Hello"   → "He"
                    Input :"abcdefg" → "ab"
                    Input :"a"         → "a"
                    Input :""         → "It can not be empty"
 */