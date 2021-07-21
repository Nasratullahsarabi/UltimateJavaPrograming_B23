package mthod2;

import java.util.Scanner;

public class coverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(coverString(in.nextLine(), in.nextLine()));


        in.close();
    }
    public static String coverString (String main, String coverMe){

        String result = "";
        if (main.contains(coverMe)){

            result = main.replace(coverMe, "["+coverMe+"]");

        }else{
            result = "["+main+"]";
        }
        return result;
    }
}
