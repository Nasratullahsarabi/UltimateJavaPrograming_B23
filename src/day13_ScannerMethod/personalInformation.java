package day13_ScannerMethod;

import java.util.Scanner;

public class personalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = scan.nextInt();

        System.out.println("Enter your gender");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");
        String name= scan.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("name = " + name);
        System.out.println("jobTitle = " + jobTitle);
    }
}
