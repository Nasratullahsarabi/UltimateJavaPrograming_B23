package array;

import java.util.Arrays;

public class printShortesWord2 {
    public static void main(String[] args) {

        String words = "olive, fish, t, old, wa, py, ja, co, cat, ray";
        String[]array = words.split(",");
        String shortest = array[0]; String result = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < shortest.length()){
                result += array[i];
            }
        }
        System.out.println(result);
    }
}
