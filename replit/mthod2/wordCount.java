package mthod2;

import java.util.Scanner;

public class wordCount {
    public static int wordCount (String sentence){

        String []str = sentence.split(" ");
        return str.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(wordCount(scan.nextLine()));
    }
}
