package day32_MethodOverLoading;

import java.util.Arrays;

public class removeOneElement {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};
        double arr1[] = {10.4, 20.2, 30, 40.5};
        String []str = {"Nasrat", "Asad", "Jawad", "Wahid"};
        char []ch = {'a','b','c','d','e','f'};

        System.out.println(Arrays.toString(remove(arr, 2)));
        System.out.println(Arrays.toString(remove(arr1, 3)));
        System.out.println(Arrays.toString(remove(str, 1)));
        System.out.println(Arrays.toString(remove(ch, 4)));



    }

    public static int[] remove(int[] arr, int num) {

        arr[num] = 0;
        int [] result = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static double[] remove(double[] arr, int num ) {

        arr[num] = 0;
        double [] result = new double[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static String[] remove(String[] arr, int num ) {

        arr [num] = "";
        String [] result = new String[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static char[] remove(char[] arr, int num ) {

        arr [num] = ' ';
        char [] result = new char[arr.length-1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (' ')) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
    
}