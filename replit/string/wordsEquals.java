package string;

import java.util.Scanner;

public class wordsEquals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        String result = "";
        result = (word1.equals(word2))?""+word1+" equals "+word2:word1+" does not equal "+word2;

        System.out.println(result);

        scan.close();
    }
}
