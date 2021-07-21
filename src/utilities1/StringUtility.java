package utilities1;

import java.util.Arrays;

public class StringUtility {

    // Revers an String.
    public static String revers(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result+= str.charAt(i);
        }
        return result;
    }

    // Shows if two words are Anagarm
    public static String anagram(String str1, String str2){

        char [] word1 = str1.toCharArray();
        Arrays.sort(word1);
        char [] word2 = str2.toCharArray();
        Arrays.sort(word2);
        String result = "";
        if (Arrays.equals(word1, word2)){
            result = "Anagram";
        }else {
            result = "Not Anagram";
        }
        return result;
    }

    // Shows if a word is palindrome
    public static String palindrome(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result+=str.charAt(i);
        }
        if (result.equalsIgnoreCase(str)){
            result="Palindrom";
        }else {
            result= "Not Palindrom";
        }
        return result;
    }

    // Remove duplicated char from every string
    public static String removeDup(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    // Shows anagram in the form of true or false
    public static boolean anagramBolean (String str1, String str2){

        char[] str3 = str1.toCharArray();
        Arrays.sort(str3);
        char[] str4 = str2.toCharArray();
        Arrays.sort(str4);

        return Arrays.equals(str3,str4);

    }

    // Shows palindrome in the form of true or false
    public static boolean palindromBolean (String str){

        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        boolean isPalindrom = result.equalsIgnoreCase(str);
        return isPalindrom;
    }

    // Find frequency of a specific char
    public static int frequency (String str, char ch){

        int count = 0;
        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }
        return count;
    }

    // Find unique chars in a string
    public static String uniqueChar(String str){
        String uniqueCh = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                uniqueCh+=str.charAt(i);
            }
        }
        return uniqueCh;
    }

    //Find frequency of each char in a string
    public static String freqOfEachChar(String str){

        String result = "", removeDup = "";  char ch = 'a';

        for (int i = 0; i < str.length(); i++) {
            if (!removeDup.contains(""+str.charAt(i))){
                removeDup+=str.charAt(i);
            }
        }
        for (int j = 0; j < removeDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (removeDup.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            result+=removeDup.charAt(j)+""+count;
        }
        return result;
    }

    // Find count of a word in a sentence
    public static int frequencyOfWords(String sentence, String word){
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            count++;
        }
        return count;

    }






}
