package mthod2;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int [][]mergR = { {1,2,3,6},{4,6} };

        int []arrM = new int[mergR[0].length+mergR[1].length];

        int j = 0;

        for (int[] each: mergR){

            for (int element: each){
                arrM[j++] = element;
            }
        }

        System.out.println(Arrays.toString(arrM));


    }
}
