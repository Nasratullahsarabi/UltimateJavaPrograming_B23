package string;

import java.util.Scanner;

public class lastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = "";

        if (word.length()<4){
            result = "Too short";
        }else if(word.length()>4){
            result = "Too long";
        }else {
            result += word.charAt(3);
        }
        System.out.println(result);

        scan.close();
    }
}
