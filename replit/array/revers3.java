package array;

import java.util.Arrays;

public class revers3 {
    public static void main(String[] args) {

        String str = "Java is fun can I talk";

        String[]arr = str.split(" ");

        for (int i = arr.length-1; i > 0; i--) {

            System.out.print(arr[i]+" ");

        }



    }
}
