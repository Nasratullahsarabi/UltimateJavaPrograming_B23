package day15_String;

import java.util.Scanner;

public class reversString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = "Blank"; String result = "";

        if(word.length()>5){
            result = "too long";

        }else if (word.length()<5){
          result = "too shor";
        }else {
            result  +=word.charAt(4);
            result  +=word.charAt(3);
            result  +=word.charAt(2);
            result  +=word.charAt(1);
            result  +=word.charAt(0);
            // resultul = " " + word.charAt(4) + word.charAt(3) + word.charAt(2) +
           // word.charAt(1) + word.charAt(0);
        }
        System.out.println(result);

    }
}
