package array;

import java.util.Arrays;

public class frontPeices {
    public static void main(String[] args) {
        int[]arr = {7,8};
        int[]arr2 = new int[arr.length];
        int[]arr3 = new int[2];


        for (int i = 0; i < arr2.length; i++) {

            if (arr.length == 1 || arr.length == 2){
                arr2[i] = arr[i];
            }else {
                arr3[i] = arr[i];
                arr2 = arr3;
            }


        }
        System.out.println(Arrays.toString(arr2));
    }
}
