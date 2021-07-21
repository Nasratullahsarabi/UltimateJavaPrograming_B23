package day24_Arrays;

import java.util.Arrays;

public class reversArray {
    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5};
        int[]revers= new int[array.length];

        for (int i = array.length-1, j=0; i >= 0 ; i--,j++) {
            revers[j] = array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(revers));


        }

    }




