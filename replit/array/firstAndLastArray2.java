package array;

import java.util.Arrays;

public class firstAndLastArray2 {
    public static void main(String[] args) {
        String []arr = {"hello", "why", "by", "apple" , "note"};
        String []arr2 = new String[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            arr2[j] = arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1);
            j++;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
