package stringMethod;

import java.util.Locale;

public class printFirstTwoCharacters {
    public static void main(String[] args) {
        String word = "back";

        if(word.length()>=1){
            if (word.length()>=2){
                System.out.println(word.charAt(0)+""+word.charAt(1));
          //      System.out.println(word.substring(0,2));
            }else{
                System.out.println(word);
            }
        }else {
            System.out.println("it can not be empty");
        }


    }
}
