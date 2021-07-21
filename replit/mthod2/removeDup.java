package mthod2;

import java.util.Arrays;
import java.util.Scanner;

public class removeDup {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
        System.out.println("===========================");

    }
    public static String uniqueChars(String str){

        String uniqueElement = "";
        for (int i = 0; i < str.length(); i++) {

            if (!uniqueElement.contains(""+str.charAt(i))){
                uniqueElement+=str.charAt(i);
            }
        }
        return uniqueElement;
    }



}
