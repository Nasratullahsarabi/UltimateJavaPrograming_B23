package day25_ForEachLoop;

import java.util.Arrays;

public class mergeArrayPractice {
    public static void main(String[] args) {

        int[]arr1 = {1, 2, 3, 4, 5},
                arr2 = {6, 7, 8, 9, 10},
                arr3 = {11, 12, 13, 14, 15},
                merge = new int[arr1.length+ arr2.length+ arr3.length];

        int x = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[x++]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            merge[x++] = arr2[j];

        }
        for (int i = 0; i < arr1.length; i++) {
            merge[x++]= arr3[i];
        }
        System.out.println(Arrays.toString(merge));

    }
}
