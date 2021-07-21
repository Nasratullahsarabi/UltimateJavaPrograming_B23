package day6_ArraysPractice;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {

        String name = "Nasratullah is a hero";
        String []str = name.split(" ");

        System.out.println(Arrays.toString(str));


        String str1 = "ab ab ab ab ";

        String []str2 = str1.split("ab ");

        System.out.println(Arrays.toString(str2));

    }
}
