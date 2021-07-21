package overLoadingPractice;

import utilities1.StringUtility;

public class stringPractice {
    public static void main(String[] args) {
        String word ="Nasrat";
        word = StringUtility.revers(word);

        System.out.println(word);
        System.out.println("================================");
        String word1 ="listen";
        String word2 = "silent";

        String checkAnagram = StringUtility.anagram(word1,word2);
        System.out.println(checkAnagram);
        System.out.println("=========================================");

        String word3 = "lever";
        word3 = StringUtility.palindrome(word3);
        System.out.println(word3);
        System.out.println("=========================================");
        String word4 = "aaabbbcccdddeffljjj";

        word4 = StringUtility.removeDup(word4);
        System.out.println(word4);
        System.out.println("=========================================");

        String word5 = "silent";
        String word6 = "listeny";
        boolean anagram = StringUtility.anagramBolean(word5, word6);

        System.out.println(anagram);
        System.out.println("=========================================");
        String word7 = "madak";

        boolean isPalindrom = StringUtility.palindromBolean(word7);
        System.out.println(isPalindrom);
        System.out.println("=========================================");

        String word8 = "aaaabbbbcccdddfffc";
        char ch = 'b';

       int freq =  StringUtility.frequency(word8,ch);

        System.out.println(freq);
        System.out.println("=========================================");

        String word9 = "aaaabcccdfffh";
        String unique = StringUtility.uniqueChar(word9);
        System.out.println(unique);

        System.out.println("=========================================");
        String word10 = "aaaabbbbcccdddfffc";

        String charCount = StringUtility.freqOfEachChar(word10);

        System.out.println(charCount);

        System.out.println("=========================================");

        String sent = "kabul I am going to go to kabul to to kabul";
        String word11 = "kabul";
        int count = StringUtility.frequencyOfWords(sent,word11);

        System.out.println(count);
    }
}
