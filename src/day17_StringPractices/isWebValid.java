package day17_StringPractices;

import java.util.Scanner;

public class isWebValid {
    public static void main(String[] args) {
        String correctStartWeb = "www.";
        String correctEndWeb1 = ".com";
        String correctEndWeb2 = ".edu";
        String correctEndWeb3 = ".gov";
        Scanner scan = new Scanner(System.in);
        String web = scan.nextLine();

        boolean validWeb = web.startsWith("www.") && web.endsWith(".com") || web.endsWith(".edu") || web.endsWith(".gov");

        if (validWeb){
            System.out.println("valid web");
        }else {
            System.out.println("ivalid web");
        }

        scan.close();
    }
}
/*
task 2
write a program to verify if the bellow webs are valid:
requirement:
a valid web should starts with www. and end with .com, .edu , .gov
 */