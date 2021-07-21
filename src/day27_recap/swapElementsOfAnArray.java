package day27_recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swapElementsOfAnArray {
    public static void main(String[] args) {

        int []num = {1, 2, 3, 4, 5, 6};

        int temp = num [0];
        num[0] = num.length;
        num[num.length-1] = temp;

        System.out.println(Arrays.toString(num));




    }

}
