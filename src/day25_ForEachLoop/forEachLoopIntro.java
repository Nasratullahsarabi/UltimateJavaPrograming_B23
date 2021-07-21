package day25_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class forEachLoopIntro {
    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5};

        for ( int each: numbers) {

            System.out.print(each);

        }
        System.out.println();
        System.out.println("===============================");

        String[]words = {"Java", "Python", "Chrom", "Google"};

        for (String each : words) {

            System.out.print(each+", ");

        }
    }
}
