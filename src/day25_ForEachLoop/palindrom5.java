package day25_ForEachLoop;

import java.util.Arrays;

public class palindrom5 {
    public static void main(String[] args) {

        String[]arr = {"Nasrat", "Ateeq", "Asad", "Wahid"};
        String[]rev = new String[arr.length];

        for (int j = 0; j < arr.length; j++) {
        String element = arr[j], result = "";
        for (int i = element.length()-1;i >=0;i--){

            result+=element.charAt(i);
        }
        rev[j] = result;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rev));
    }
}
