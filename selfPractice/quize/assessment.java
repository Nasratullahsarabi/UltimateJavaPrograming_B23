package quize;

import java.util.Arrays;

public class assessment {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []revers = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {

            revers[j++] = arr[i];
            System.out.println(revers[j]);
        }

    }
}