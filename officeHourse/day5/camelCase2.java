package day5;

import java.util.Locale;

public class camelCase2 {
    public static void main(String[] args) {
        String str = "nasratAteeqMuzafarWahid";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){

                System.out.println(result);
                result="";
            }

            if (i == 0){
                result+= (""+str.charAt(i)).toUpperCase(Locale.ROOT);
            }else {
                result+=str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
