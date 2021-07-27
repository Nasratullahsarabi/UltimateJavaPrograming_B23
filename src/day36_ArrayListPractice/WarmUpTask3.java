package day36_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask3 {
    public static void main(String[] args) {

        String [] str1= {"A", "B", "C"};
        String [] str2 = {"D", "E", "F"};

        ArrayList<String> result = new ArrayList<>(Arrays.asList(str1));
        result.addAll(Arrays.asList(str2));

        System.out.println(result);
    }
}

/*
write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
