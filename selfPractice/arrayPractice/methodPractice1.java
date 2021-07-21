package arrayPractice;

import utilities1.ArrayUtility;

import java.util.Arrays;

public class methodPractice1 {
    public static void main(String[] args) {
        int arr [] = {3,2,3,4,5,6,5,2,3,4,3};
        int num = 3;
        int result = ArrayUtility.frequency(arr,num);
        System.out.println(result);
        System.out.println("============================");
        double arr1 [] = {3.4,2.4,3.2,4.7,5,6,5.9,2,3.1,4,3.1};
        double num2 = 3.1;
        int result1 = ArrayUtility.frequency(arr1,num2);
        System.out.println(result1);
        System.out.println("=================================");
        String[]str = {"Asad", "Nasrat","Ateeq", "Nasrat","Jawad","Nasrat"};
        String word = "Nasrat";
        int result2 = ArrayUtility.frequency(str,word);

        System.out.println(result2);
        System.out.println("=================================");
        char[]ch = {'A', 'N','T', 'M','J','N','A','N'};
        char litter = 'Z';
        int result3 = ArrayUtility.frequency(ch,litter);
        System.out.println(result3);
        System.out.println("=================================");
        int arr4 [] = {3,2,3,4,5,6,5,2,3,4,3,7,9};
        arr4 = ArrayUtility.unique(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
