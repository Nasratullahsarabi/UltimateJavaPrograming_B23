package array;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        int[]num1 = {6, 2, 5, 3};
        int[]num2 = new int[num1.length*2];

        num2[num2.length-1] = num1[num1.length-1];

        System.out.println(Arrays.toString(num2));

    }
}
