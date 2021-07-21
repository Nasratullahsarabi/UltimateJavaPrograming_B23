package stringMethod;

import java.util.Locale;

public class printFirstMiddleAndLastChar {
    public static void main(String[] args) {
        String word = "CYBERTE";
        if (word.length() >= 3){
            if (word.length()%2!=0){
                System.out.println(word.toLowerCase(Locale.ROOT).charAt(0));
                System.out.println(word.toLowerCase(Locale.ROOT).charAt(word.length()/2));
                System.out.println(word.toLowerCase().charAt(word.length()-1));
            }else{
                System.out.println(word.toLowerCase().charAt(0));
                System.out.println(word.toLowerCase().charAt(word.length()-1));
                System.out.println(word.toLowerCase().charAt(word.length()/2-1)+""+word.charAt(word.length()/2));

            }
        }else{
            System.out.println("too short");
        }
    }
}
