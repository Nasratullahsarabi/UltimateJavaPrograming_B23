package day17_StringPractices;

import java.util.Scanner;

public class isGmailValid {
    public static void main(String[] args) {

        String correctEmail = "@gmail.com";
        Scanner scan = new Scanner(System.in);

        String email = scan.next();

        boolean validEmail = email.endsWith(correctEmail);

        System.out.println(validEmail);

        scan.close();

    }
}
/*
task 1
write a program to verify if the gmail is valid:
requirement:
a valid gmail account should end with @gmail.com

 */