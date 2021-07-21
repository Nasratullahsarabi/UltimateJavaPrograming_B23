package mthod2;

import java.util.Scanner;

public class clean {
    public static String clean(String text, String word){
        String []str = text.split(" ");

        String result = "";
        for (int i = 0; i < str.length; i++) {

            if (!str[i].equalsIgnoreCase(word)){
                result+=str[i]+" ";
            }

        }
         return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));


        in.close();
    }
}
