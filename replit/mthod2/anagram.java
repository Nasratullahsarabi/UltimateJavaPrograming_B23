package mthod2;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String word1 = "Earth";
        String word2 = "heart";
        String []arrWord1 = word1.toLowerCase().split("");
        Arrays.sort(arrWord1);

        System.out.println(Arrays.toString(arrWord1));
        String []arrWord2 = word2.toLowerCase().split("");
        Arrays.sort(arrWord2);
        System.out.println(Arrays.toString(arrWord2));

        boolean isAnagram = Arrays.equals(arrWord1, arrWord2);
        System.out.println(isAnagram);

    }
}
