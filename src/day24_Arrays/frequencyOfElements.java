package day24_Arrays;

import java.util.Arrays;

public class frequencyOfElements {
    public static void main(String[] args) {

        int[]numbers = {1, 1, 3, 5, 4, 8, 4, 6};

        for (int j = 0; j < numbers.length; j++) {
            int element = numbers[j]; int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == element){
                count++;
            }
        }
        if (count == 1){
            System.out.println(element);
        }
    }
}
}
/*
write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */