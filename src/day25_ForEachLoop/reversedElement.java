package day25_ForEachLoop;

import java.util.Arrays;

public class reversedElement {
    public static void main(String[] args) {
        String []array = {"Java", "Python", "C#"};

        for (int j = 0; j < array.length; j++) {

            String element = array[j]; String reverse = "";

            for (int i = element.length()-1; i >= 0; i--) {
                reverse+=element.charAt(i);
            }
            array[j] = reverse;

        }


        System.out.println(Arrays.toString(array));
    }
}
