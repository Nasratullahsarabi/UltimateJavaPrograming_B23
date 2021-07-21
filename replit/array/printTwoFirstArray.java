package array;

import java.util.Arrays;

public class printTwoFirstArray {
    public static void main(String[] args) {
        int[] number = {9, 2, 3, 4, 6};
        int[] newArr= new int[2];

        for (int i = 0; i < newArr.length; i++) {

            newArr[i] = number[i];

        }
        System.out.println(Arrays.toString(newArr));
    }
}
