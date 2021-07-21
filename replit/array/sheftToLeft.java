package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sheftToLeft {
    public static void main(String[] args) {
        int[]num1 = {4, 5, 6, 7};
        int[]num2 = new int[num1.length];

        int j = 0;
        for (int i = 0; i < num1.length-1; i++) {

            num2[j++] = num1[i+1];
        }
        num2[num2.length-1] = num1[0];
        System.out.println(Arrays.toString(num2));
    }
}
