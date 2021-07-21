package array;

import java.util.Arrays;

public class printShortesWord2_2 {
    public static void main(String[] args) {

        String str = "olive, fish, puhh, old, ngljlkj, jav, coffee, cat, ray";

        String[]strings = str.split(", ");
        String shortest = strings[0];
        String count = "";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < shortest.length()){
                shortest = strings[i];
                count="";
            }
            if (strings[i].length() == shortest.length()){
                count+= strings[i]+", ";
            }
        }
        String[]arr = count.split(", ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
