package day29_CustomMethodPractice;

import java.util.Arrays;

public class removeDup {
    public static void main(String[] args) {

        String word = "AAABBBBBCCCCCDDDDDDDDDDDDDDDEEEEEEEEEEEEEFFFFFFFFFFFFFF";
        String removDup = "";

        for (int i = 0; i < word.length(); i++) {

            if (!removDup.contains(""+word.charAt(i))){
                removDup+=word.charAt(i);
            }
        }
        System.out.println(removDup);

        String[] split4 = word.split("");
        char [] ch = word.toCharArray();

        System.out.println(Arrays.toString(split4));
        System.out.println(Arrays.toString(ch));
    }
}
