package day24_Arrays;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "heart", s2 = "earth";

        char[]ch1 = s1.toCharArray();
        char[]ch2 = s2.toCharArray();

        Arrays.sort(ch1); Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println(Arrays.equals(ch1, ch2));


    }
}
