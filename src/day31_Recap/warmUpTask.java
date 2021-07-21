package day31_Recap;

import java.util.Arrays;

public class warmUpTask {
    public static void main(String[] args) {
        String word = "aaaabbbcdddflljsss";
        String s = removeDup(word);
        System.out.println(s);
        System.out.println("=================================================");
        String word1 = "listeny";
        String word2 = "silent";
        System.out.println(isAnagaram(word1, word2));
        System.out.println("===================================================");
        String s1 = "aaabbbcccjjfkkkkk";
        char ch = 'a';
        System.out.println(frequency(s1,ch));
        System.out.println("===================================================");
        String s3 = "aaabccccdeeeef";
        System.out.println(uniqueChar(s3));
        System.out.println("===================================================");
        String s4 = "aaabbbcddeefggeh";
        String fre = freqOfEachChar(s4);
        System.out.println(fre);

    }

    // Remove Duplicate method e.g intput: (aaabbbccc) output: (abc)
    public static String removeDup (String str){
        String rmvDup = "";
        for (int i = 0; i < str.length(); i++) {

            if (!rmvDup.contains(""+str.charAt(i))){
                rmvDup+=str.charAt(i);
            }
        }
        return rmvDup;
    }

    // Anagram e.g input: (w1 listen, w2 silent). output = (true)
    public static boolean isAnagaram(String str1, String str2){
        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return  Arrays.equals(ch1,ch2);
    }

    // Frequency of a string
    public static int frequency (String str, char ch){

        int freq = 0;
        for (char each : str.toCharArray()){
            if (each == ch){
                freq++;
            }
        }
        return freq;
    }

    // Unique char
    public static String uniqueChar(String str){

        String uniqe = "";

        for (int i = 0; i < str.length(); i++) {

            if (frequency(str, str.charAt(i)) == 1 ){
                uniqe+=str.charAt(i);
            }
        }
        return uniqe;

    }

    public static String freqOfEachChar(String str){
        String result = "";
        for (char each : removeDup(str).toCharArray()){
            int frequency = frequency(str,each);

            result += ""+each+frequency;
        }
        return result;
    }




}
