package day13_ScannerMethod;

import java.util.Scanner;

public class nextLineMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();

        System.out.println("jobTitle = " + jobTitle);
    }
}
