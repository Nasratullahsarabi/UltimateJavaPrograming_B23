package day26_DimentionArray;

import java.util.Arrays;

public class moveAllZerosToEnd {
    public static void main(String[] args) {

        int[]array ={0, 2, 0, 10, 0, 5, 0, 1, 0};
        int []result = new int[array.length];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0){
                result[j++] = array[i];

            }

        }
        System.out.println(Arrays.toString(result));
    }
}
