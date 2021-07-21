package string;

import java.util.Scanner;

public class printWithOutFirstWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastWord = word.length()-1;
        System.out.println(word.charAt(lastWord));
        System.out.println(word.substring(word.length()-lastWord));




        scan.close();
    }
}
