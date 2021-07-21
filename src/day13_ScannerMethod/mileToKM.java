package day13_ScannerMethod;

import java.util.Scanner;

public class mileToKM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mile");
        /*
        Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */
        double mile = scan.nextDouble();
        double kM = mile*1.609;
        System.out.println(mile+" miles is equal to "+kM+"kilo meters");

    }
}
