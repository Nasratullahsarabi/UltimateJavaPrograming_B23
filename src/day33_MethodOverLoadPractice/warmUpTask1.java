package day33_MethodOverLoadPractice;

import java.util.Arrays;

public class warmUpTask1 {
    public static void main(String[] args) {

        int [] numbers = {100,200,300,400,500,600};
        numbers = revers(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("========================================");
        double [] number1 = {10.5,20.2,30.9,40,50,60.8};
        number1 = revers(number1);

        System.out.println(Arrays.toString(number1));
        System.out.println("========================================");
        String students[] = {"Dilem", "Aysu", "Muchait", "Tubga", "Fhilipp"};
        students = revers(students);
        System.out.println(Arrays.toString(students));
        System.out.println("========================================");
        char ch [] = {'a', 'b', 'c', 'd', 'f'};
        ch = revers(ch);
        System.out.println(Arrays.toString(ch));
    }
    public static int []revers(int []arr){

        int result [] = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    public static double []revers(double []arr){

        double result [] = new double[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    public static String []revers(String []arr){

        String result [] = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[j++] = arr[i];
        }
        return result;
    }

    public static char []revers(char []arr){

        char result [] = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            result[j++] = arr[i];
        }
        return result;
    }
}
