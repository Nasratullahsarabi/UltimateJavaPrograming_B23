package day32_MethodOverLoading;

import java.util.Arrays;

public class remove {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        arr[2] = 0;
        String result="";

        for (int each : arr){
            if (each !=0){
                result+=each+" ";
            }
        }
        String[] arr1 = result.split(" ");
        System.out.println(Arrays.toString(arr1));

    }
}
