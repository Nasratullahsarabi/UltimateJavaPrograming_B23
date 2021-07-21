package array;

import java.util.Arrays;

public class addToArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int number = 6;

        int merge[] = new int[arr.length+1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            merge[j++] = arr[i];
        }
        merge[j] = number;
        System.out.println(Arrays.toString(merge));
        System.out.println("==========================================");

        int merge2[] = Arrays.copyOf(arr, arr.length+1);
        int i = arr.length;

        merge2[i] = number;

        System.out.println(Arrays.toString(merge2));


    }
}
