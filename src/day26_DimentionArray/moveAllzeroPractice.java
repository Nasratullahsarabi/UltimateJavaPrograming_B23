package day26_DimentionArray;

import java.util.Arrays;

public class moveAllzeroPractice {
    public static void main(String[] args) {
        int[]number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[]sep = new int[number.length];

        int j = 0;
        for (int i = 0; i < number.length; i++) {

            if (number[i]%2==0){
                sep[j++] = number[i];
            }

        }
        System.out.println(Arrays.toString(sep));
    }
}
