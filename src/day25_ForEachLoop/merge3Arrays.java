package day25_ForEachLoop;

import java.util.Arrays;

public class merge3Arrays {
    public static void main(String[] args) {
        int[]arr1 = {1, 2, 3, 4,};
        int[]arr2 = {5, 6};
        int[]arr3 = {7, 8, 9, 10, 11};
        int[]merge= new int[arr1.length+ arr2.length+ arr3.length];

        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[i+ arr1.length] = arr2[i];
        }
        for (int i = 0; i < arr1.length+1; i++) {
            merge[i+arr1.length+arr2.length] = arr3[i];
        }

        System.out.println(Arrays.toString(merge));
    }
}
