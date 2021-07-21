package array;

import java.util.Arrays;

public class printMaxArray {
    public static void main(String[] args) {

        int [][]arr = { {1, 2, 3}, {5, 33, 9} };

        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = max;
            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
}
