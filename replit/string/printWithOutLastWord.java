package string;

import java.util.Scanner;

public class printWithOutLastWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastWord = word.length()-1;
        System.out.println(word.substring(0,lastWord));




        scan.close();
    }
}
