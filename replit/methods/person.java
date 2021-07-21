package methods;

import java.util.Arrays;
import java.util.Scanner;

public class person {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        person(s);
    }
    public static void person(String info){
        String result1 = "",
                result2="",
                result3="";
        String[]split = info.split(",");
        String result = "";
        for (int i = 0; i < split.length; i++) {

            result += "person name: "+split[i]+"\nlast name: "+split[i+1]+"\nage: "+split[i+2];
            break;
        }
        System.out.println(result);

    }
}
