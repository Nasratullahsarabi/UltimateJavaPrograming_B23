package day29_CustomMethodPractice;

import java.util.Arrays;

public class practices {
    public static void main(String[] args) {

        posNegZero(0);
        System.out.println("===================================");
        int [] array1 = {1,2,3,4};
        int [] array2 = {5,6,7,8,9,10};

        mergeTwoArray(array1,array2);
        System.out.println("===================================");

        fullName("cyBerTek", "scHool");
        System.out.println("===================================");

        maxNum(20,40);
        System.out.println("===================================");

       int arr2[] = {3,4,1,2,6,8};
        decendingOrderOfArray(arr2);
        System.out.println("===================================");
        System.out.println(minNum(1, 5));

    }
    public static void posNegZero (int num){
        if (num == 0){
            System.out.println("zero");
        }else if (num > 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }


    }

    public static void mergeTwoArray (int[]arr1,int[]arr2){
        int[]arr3 = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each : arr1) {
            arr3[i++] = each;
        }
        for (int each: arr2){
            arr3[i++] = each;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void fullName(String firstName, String lastName){

        firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName = firstName+" "+lastName;
        System.out.println("Full name: "+ fullName);

    }

    public static void maxNum (int num1, int num2){

        System.out.println( num1 > num2 ? num1 : num2 );
    }

    public static void decendingOrderOfArray (int[]arr){
        Arrays.sort(arr);
        int[]result = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            result[j++] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static int minNum (int num1, int num2){

        return  (num1 < num2)? num1:num2;

    }




    }




