package stringMethod;

public class printFirstAndLastLetterOfTwoWords {
    public static void main(String[] args) {
        String word1 = "samo";
        String word2 = "engineer";
/*
        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }

 */

        if (word1.substring(word1.length()-1).equalsIgnoreCase(word2.substring(0,1))){
            System.out.println(word1+word2.substring(1));
        }else {

        }
    }
}
