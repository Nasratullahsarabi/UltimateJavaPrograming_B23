package day4_Practice;

public class print2Chars {
    public static void main(String[] args) {

        String word = "h";
        if (word.length() == 1){
            System.out.println(word+"@");
        }else {
            System.out.println(word.substring(0,2));
        }

    }
}
/*
return a string length 2 made of its first 2 chars. if the string length
is less than 2 chars use '@' for the missing chars.
 */