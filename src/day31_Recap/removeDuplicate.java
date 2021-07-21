package day31_Recap;

import java.util.Arrays;

public class removeDuplicate {
    public static String removeDup(String str){
        String result = "";
        for (char ch : str.toCharArray()){

            if (result.indexOf(ch) < 0){
                result+=ch;
            }
        }

        return result;
    }

    public static boolean isAnagram(String str1, String str2){

        char[]ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static int frequency(String str, char ch){
        int count = 0;
        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "aaabbbdddd";
       String r = removeDup(str);

        System.out.println(r);
        System.out.println("========================================");

        String s1 = "silent";
        String s2 = "listen";

        System.out.println(isAnagram(s1, s2));
        System.out.println("==========================================");
        String word = "MMMMMMMMNNNNNNNAAAAAAA";
        int n1 = frequency(word,'M');

        System.out.println(n1);
        System.out.println("==========================================================");
        String s = "aaaaaabcccccdeeeeef";
        String unique = "";
        int frequncy = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            unique += frequency(s, ch);

        }
        System.out.print(unique);

    }


}
