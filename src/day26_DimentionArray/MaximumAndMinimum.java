package day26_DimentionArray;

import java.util.Arrays;

public class MaximumAndMinimum {
    public static void main(String[] args) {

        int[][] numbers = {{10,20,30},{40,50,60,70,80}};

        int max = numbers[0][0], min = numbers [0][0];

        for (int[] each1 : numbers) {

            for (int each2 : each1) {

                if (each2 > max){
                    max = each2;
                }
                if (each2 < min){
                    min = each2;
                }

            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
