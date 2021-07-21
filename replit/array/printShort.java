package array;

import java.util.Arrays;

public class printShort {
    public static void main(String[] args) {

        String str = "oli, fish, puh, old, ngljlkj, jav, coffee, cat, ray";

        String[]strings = str.split(", ");
        String shortest = strings[0];
        String count = "";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < shortest.length()){
                shortest = strings[i];
                System.out.println(strings[i]);
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
