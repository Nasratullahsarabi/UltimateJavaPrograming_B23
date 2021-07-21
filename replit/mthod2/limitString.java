package mthod2;

import java.util.Scanner;

public class limitString {
    public static String limit(String text, int maxLingth){
        String result = text.substring(0,maxLingth);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));


        in.close();
    }
}
