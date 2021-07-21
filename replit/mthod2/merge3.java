package mthod2;

import java.util.Arrays;

public class merge3 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        int [] number2 = {40,50,60,70,80};

        int[]merge = new int[numbers.length+number2.length];

        int z = 0;

        for (int each: numbers){
            merge[z++] = each;
        }
        for (int element : number2){
            merge[z++] = element;
        }

        System.out.println(Arrays.toString(merge));
    }
}
