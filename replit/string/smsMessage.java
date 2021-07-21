package string;

import java.util.Locale;

public class smsMessage {
    public static void main(String[] args) {

        String word = "javax";

        boolean xx = word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x");
        boolean firstx = word.toLowerCase().startsWith("x");
        boolean lastx = word.toLowerCase().endsWith("x");

        if (xx){
            System.out.println(word.substring(1,word.length()-1));
        }else if (firstx){
            System.out.println(word.substring(1));
        }else if (lastx){
            System.out.println(word.substring(0,word.length()-1));
        }

    }
}
