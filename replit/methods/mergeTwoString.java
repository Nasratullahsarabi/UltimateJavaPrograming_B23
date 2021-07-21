package methods;

import java.util.Scanner;

public class mergeTwoString {
    public static String mergeStrings(String one, String two){
        String merge = "";
        for (int i = 0; i < one.length()&& i <two.length(); i++) {

            merge += ""+one.charAt(i)+two.charAt(i);

        }
        return merge;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));

        in.close();
    }
}
