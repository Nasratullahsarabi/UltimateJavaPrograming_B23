package scanner;

import java.util.Scanner;

public class secondConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds");
        int inputSecond = scan.nextInt();
        int hour =  inputSecond/3600;
        int minute = (inputSecond%3600)/60;
        int second = inputSecond%3600%60;
        System.out.println(hour+" hours, "+minute+" minutes, and "+second+" seconds");


    }
}
