package mthod2;

import java.util.Scanner;

public class coverMe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(coverString(in.nextLine(),in.nextLine()));
        in.nextLine();

        in.close();
    }
    public static String coverString (String main, String coverMe){

        String result = "";

        for (int i = 0; i < main.length(); i++) {

            if (main.contains(coverMe)){

                result = main.replace(coverMe, "["+coverMe+"]");
            }

        }
        return result;
    }
}
