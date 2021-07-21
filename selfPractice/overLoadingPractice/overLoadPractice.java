package overLoadingPractice;

import utilities1.ArrayUtility;

import java.util.Arrays;

public class overLoadPractice {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,3,5,4,1,7};
        int[] unique = ArrayUtility.unique(arr);

        System.out.println(Arrays.toString(unique));
        System.out.println("==========================");

        double arr1 [] = {1.4,2.2,3.5,4,5.5,6,3.5,5,4,1.4,7};
        double[] unique1 = ArrayUtility.unique(arr1);

        System.out.println(Arrays.toString(unique1));
        System.out.println("==========================");

        String str[] = {"Nasrat", "Asad", "Ateeq", "Jawad","Asad", "Jawad"};
        String result[] = ArrayUtility.unique(str);
        System.out.println(Arrays.toString(result));
        System.out.println("========================================");

        char ch[] = {'a', 'a', 'b', 'c', 'b', 'j'};
        char result1 [] = ArrayUtility.unique(ch);
        System.out.println(Arrays.toString(result1));
        System.out.println("==========================");

        int arr2 [] = {1,4,2,2,3,5,4,5,5,6,3,5,5,4,1,4,7};
        int[]result2 = ArrayUtility.removeDup(arr2);
        System.out.println(Arrays.toString(result2));
        System.out.println("==========================");

        String str1[] = {"Nasrat", "Asad", "Ateeq", "Jawad","Asad", "Jawad"};
        String result3[] = ArrayUtility.removeDup(str1);
        System.out.println(Arrays.toString(result3));
        System.out.println("========================================");
        char ch1[] = {'a', 'a', 'b', 'c', 'b', 'j'};
        char result4 [] = ArrayUtility.removeDup(ch1);
        System.out.println(Arrays.toString(result4));
        System.out.println("==========================");

    }
}
