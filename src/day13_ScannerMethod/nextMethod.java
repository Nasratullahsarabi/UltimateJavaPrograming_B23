package day13_ScannerMethod;

import java.util.Scanner;

public class nextMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name");
        String name = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        String fullName = name+" "+lastName;
        System.out.println("fullName = " + fullName);

    }
}
