package day27_recap;

import java.util.Arrays;

public class arrayUtilityPractice {
    public static void main(String[] args) {

        int[]arr = {1,2,3};
        int[]arr1 = Arrays.copyOf(arr,10);

        System.out.println(Arrays.toString(arr));

        int []num = {5, 6, 7, 9};

        int[]num2 = Arrays.copyOf(num,5);

        System.out.println(Arrays.toString(num2));

        System.out.println("========================================");

        int [] number1 = {1, 2, 3, 4, 5, 6};
        int [] number2 = {7,8,9,10};

        int [] merge = Arrays.copyOf(number1, number1.length+number2.length );

        int j = number1.length;

        for (int each:number2) {

            merge[j++] = each;
        }
        System.out.println(Arrays.toString(merge));


    }
}
