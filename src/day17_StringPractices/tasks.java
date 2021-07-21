package day17_StringPractices;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {

        String gmail = "Cybertek@gmail.com";
        /*
        String domain = gmail.substring(gmail.indexOf("A"));
        boolean isValidGmail = domain.equals(("@gmail.com"));

         */

        System.out.println("=============================");

        String url = "www.amazon.com";

        boolean isValidUrl = url.startsWith("www.") && url.endsWith(".com") ||url.endsWith(".edu") ||url.endsWith(".gov");

        System.out.println(isValidUrl);
        System.out.println("=============================");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");

        String word = scan.next();

        boolean endswithLY = word.substring(word.length()-2).equals("LY");

        boolean endswithLY2 = word.endsWith("LY");

        if (endswithLY2){
            System.out.println("really");
        }else {
            System.out.println("never mind");
        }

        scan.close();

    }
}
