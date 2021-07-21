package day32_MethodOverLoading;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {

        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(merge(array1, array2)));
        System.out.println("===================================");
        double array3[] = {1.8, 2.4, 3, 4, 5};
        double array4[] = {6, 7, 8.6, 9, 10.3};

        System.out.println(Arrays.toString(merge(array3, array4)));
        System.out.println("===================================");
        String str1[] = {"Ateeq", "Nasrat", "Asad"};
        String str2[] = {"hamasa", "Muzafar", "hashmat"};

        System.out.println(Arrays.toString(merge(str1, str2)));
        System.out.println("===================================");
        char str3[] = {'A', 'N', 'd'};
        char str4[] = {'h', 'M', 'h'};

        System.out.println(Arrays.toString(merge(str3,str4)));

        System.out.println(Arrays.toString(merge(str1, str2)));


    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int merge1[] = Arrays.copyOf(arr1, arr1.length + arr2.length);

        int j = arr1.length;

        for (int each : arr2) {
            merge1[j++] = each;
        }
        return merge1;

    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double merge2[] = Arrays.copyOf(arr1, arr1.length + arr2.length);

        int i = arr1.length;

        for (double each : arr2) {
            merge2[i++] = each;
        }
        return merge2;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String merge2[] = Arrays.copyOf(arr1, arr1.length + arr2.length);

        int i = arr1.length;

        for (String each : arr2) {
            merge2[i++] = each;
        }

        return merge2;

    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char merge2[] = Arrays.copyOf(arr1, arr1.length + arr2.length);

        int i = arr1.length;

        for (char each : arr2) {
            merge2[i++] = each;
        }

        return merge2;

    }
}