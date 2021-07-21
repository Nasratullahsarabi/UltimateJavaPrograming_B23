package day15_String;

import java.util.Scanner;

public class nameformating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Emter your first name");
        String firstName = scan.nextLine().trim();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("Enter your last name");

        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName =firstName+" "+lastName;

        System.out.println(fullName);

    }
}
/*
ask the user to enter the first name:
1. make sure there is no whiete space
2. make sure first character is upper case & rest of the characters need to be lowercase
Example:
input:
                       mUHTar
output:
         Muhtar
 */