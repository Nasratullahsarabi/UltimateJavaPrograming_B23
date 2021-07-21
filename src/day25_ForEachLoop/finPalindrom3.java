package day25_ForEachLoop;

import java.util.Arrays;

public class finPalindrom3 {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#"};
        String[] reverse = new String[array.length];


            String element = array[0];
            String result = "";

            for (int j = element.length() - 1; j >= 0; j--) {

                result +=element.charAt(j);

            }
            System.out.print(result);
            reverse[0] = result;


        System.out.println();
        System.out.print(Arrays.toString(reverse));

    }
}
