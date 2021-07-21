package day25_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class classMates {
    public static void main(String[] args) {

        String[]names = {"Nasrat", "Ateeq", "Asad", "Wahid"};

        for (String each :names) {
            System.out.print(each.substring(0,3)+", ");

        }
    }
}
/*
write a program to print only the first three letters of the words
 */