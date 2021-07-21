package day32_MethodOverLoading;

import java.util.Arrays;

public class warmUpTask2 {
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int number1 = 10;
        arr1 = addInteger(arr1,number1);
        System.out.println(Arrays.toString(arr1));
        arr1 = addInteger(arr1, 11);
        System.out.println(Arrays.toString(arr1));
        arr1 = addInteger(arr1,12);
        System.out.println(Arrays.toString(arr1));

        System.out.println("===============================================");

        double arr2[] = {1.5,2.5,3.5};
        double number2 = 4.5;

        System.out.println(Arrays.toString(addDouble(arr2,number2)));

        String arr3[] = {"Nasrat","Ateeq","Muzafar"};
        String str = "Asad";

        System.out.println(Arrays.toString(addStr(arr3, str)));

        char []arr4 = {'A','B','C','D'};
        char ch = 'E';

        System.out.println(Arrays.toString(addChar(arr4, ch)));
        System.out.println("=========Using overload method===============");

        int []arr5 = {1,2,3,4};
        int number3 = 5;
        int[] res = addElement(arr5,number3);
        res = addElement(arr5,number3);
        System.out.println("A: "+Arrays.toString(res));


        double []arr6 = {1.2,2.5,3.3,4};
        double number4 = 5.1;
        double[] res1 = addElement(arr6,number4);
        System.out.println(Arrays.toString(res1));

        String []str4 = {"Nas", "Atee","Asad"};
        String str5 = "Muz";
        String[] res2 = addElement(str4, str5);

        System.out.println(Arrays.toString(res2));



    }
    public static int[] addInteger (int array[], int number){
        /*
        int [] result = new int[array.length+1];
        int i = 0;
        for (int each : array){
            result[i++] = each;
        }
        result[i] = number;
        return result;

         */

        int [] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

    public static double[]addDouble (double array[], double number){
        double arrayD[] = Arrays.copyOf(array, array.length+1);
        arrayD[arrayD.length-1] = number;

        return arrayD;

    }

    public static String []addStr (String array[], String str){
        String result[] = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = str;

        return result;
    }

    public static char [] addChar (char[]array, char ch){
        char []result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;

        return result;
    }

    //----------------------------------Method Overloading---------------------------
    public static int[] addElement (int array[], int number){
        /*
        int [] result = new int[array.length+1];
        int i = 0;
        for (int each : array){
            result[i++] = each;
        }
        result[i] = number;
        return result;

         */

        int [] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

    public static double[]addElement (double array[], double number){
        double arrayD[] = Arrays.copyOf(array, array.length+1);
        arrayD[arrayD.length-1] = number;

        return arrayD;

    }

    public static String []addElement (String array[], String str){
        String result[] = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = str;

        return result;
    }

    public static char [] addElement (char[]array, char ch){
        char []result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;

        return result;
    }

}
