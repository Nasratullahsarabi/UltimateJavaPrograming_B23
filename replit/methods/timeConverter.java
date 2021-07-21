package methods;

import java.util.Arrays;
import java.util.Scanner;

public class timeConverter {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        timeConversion(scan.next());

    }
    public static void timeConversion(String s){
        String split[] = s.split(":");
        String result = "";
        for (int i = 0; i < split.length; i++) {

            System.out.println(split[i]);
            result+=split[i];
        }
        System.out.println(result);
    }
}
