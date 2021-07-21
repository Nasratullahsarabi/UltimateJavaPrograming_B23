package day33_MethodOverLoadPractice;

import utilities.ArraysUtility;
import utilities.ArraysUtility;

import java.util.Arrays;

public class warmUpTask3 {
    public static void main(String[] args) {

        int arr[] = {1,1,2,1,3,4,2,5,7};

        arr = uniqe(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int frequency (int[] array, int element){
        int count = 0;

        for (int each : array){
            if (each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequency (double[] array, int element){
        int count = 0;

        for (double each : array){
            if (each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequency (String[] array, int element){
        int count = 0;

        for (String each : array){
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    public static int frequency (char[] array, int element){
        int count = 0;

        for (char each : array){
            if (each == element){
                count++;
            }
        }
        return count;
    }

    public static int[]uniqe(int[]arr){
        int result[] = {};

        for (int each : arr){

            if ( frequency(arr, each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[]uniqe(double[]arr){
        double result[] = {};

        for (double each : arr){

            if ( frequency(arr, (int) each) == 1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}


