package day29_CustomMethodPractice;

import java.util.Arrays;

public class warmUpTasks {
    public static void main(String[] args) {

        posNegZero(-10);
        int []number1 = {1, 4, 5, -9, 0, -2};

        for (int i = 0; i < number1.length; i++) {

            posNegZero(number1[i]);
        }
        System.out.println("===============================================");
        int []array1 = {1,2,3,4,5},
                array2 = {6,7,8,9,10};
        mergOfTwoArrays(array1,array2);
        System.out.println("===============================================");
        formatFullName("cyBertek","sChOoL");
        System.out.println("===============================================");
        maxNumber(3,6);
        System.out.println("===============================================");
        int []arr = {1, 5, 6, 2, 3, 9, 0, -2, 10};
        decendingOrder(arr);
    }
    public static void posNegZero (int number){
        if (number==0){
            System.out.println(number+" is zero");
        }else if(number > 0){
            System.out.println(number+" is positive");
        }else{
            System.out.println(number+" is negative");
        }
    }

    public static void mergOfTwoArrays (int[]arr1, int []arr2){

        int[]merge = new int[arr1.length+ arr2.length];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[k++] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {

            merge[k++] = arr2[j];
        }
        System.out.println(Arrays.toString(merge));

    }

    public static void formatFullName(String firstN, String lastN){

        String firtName = firstN.substring(0,1).toUpperCase()+firstN.substring(1).toLowerCase();
        String lastName = lastN.substring(0,1).toUpperCase()+lastN.substring(1).toLowerCase();

        System.out.println(firtName+" "+lastName);
    }

    public static void maxNumber (int num1, int num2){
        if(num1 > num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }

    public static void decendingOrder (int[]array){
        Arrays.sort(array);
        int []result = new int[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            result[j++] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }

}
