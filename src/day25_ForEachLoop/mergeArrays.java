package day25_ForEachLoop;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[]arr1 = {1, 2, 3, 4,};
        int[]arr2 = {5, 6};
        int[]merge= new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[i+arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(merge));
    }
}
