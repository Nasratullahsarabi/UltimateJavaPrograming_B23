package day13_ScannerMethod;

import java.util.Scanner;

public class scannerMethodPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("you are full time employee");
        boolean isFullTime = scan.nextBoolean();

        System.out.println("you are and adutl");
        boolean adult = scan.nextBoolean();

        System.out.println("you are married");
        boolean isMarried = scan.nextBoolean();

        System.out.println("isFullTime = " + isFullTime);
        System.out.println("adult = " + adult);
        System.out.println("isMarried = " + isMarried);
    }
}
