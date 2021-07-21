package day33_MethodOverLoadPractice;

import java.util.Arrays;
import utilities.ArraysUtility;

public class warmUpTask0 {
    public static void main(String[] args) {

        int [] numbers = {100,200,300,400,500,600};

        numbers = remove(numbers,3);

        System.out.println(Arrays.toString(numbers));
        System.out.println("===============================================");
        double [] number1 = {100.5,200.6,300.2,400.6,500.8,600.2};

        number1 = remove(number1, 2);

        System.out.println(Arrays.toString(number1));
        System.out.println("===============================================");
        String students[] = {"Dilem", "Aysu", "Muchait", "Tubga", "Fhilipp"};

        students = remove(students, 2);

        System.out.println(Arrays.toString(students));
        System.out.println("===============================================");

        int [] number2 = {100,200,300,400,500,600};
        int [] number3 = {100,200,300,400,500,600};
        int [] arrayM = ArraysUtility.merge(number2, number3);

        System.out.println(Arrays.toString(arrayM));


    }
    public static int[]remove(int[]array, int index){
        int[] result = new int[array.length-1];

        if (index < 0 || index > array.length-1){
            System.out.println("invalid index");
            return array;
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = array[i];
            }
        }
        return result;
    }


    public static double[]remove(double[]array, int index){
        double[] result = new double[array.length-1];

        if (index < 0 || index > array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = array[i];
            }
        }
        return result;
    }


    public static String[]remove(String[]array, int index){
        String[] result = new String[array.length-1];

        if (index < 0 || index > array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = array[i];
            }
        }
        return result;
    }

    public static char[]remove(char[]array, int index){
        char[] result = new char[array.length-1];

        if (index < 0 || index > array.length-1){
            System.out.println("invalid index");
            System.exit(0);
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index){
                continue;
            }else {
                result[j++] = array[i];
            }
        }
        return result;
    }
}
