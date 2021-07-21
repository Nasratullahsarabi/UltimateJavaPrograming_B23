package day15_String;

import java.util.Scanner;

public class intial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        //char f = scan.next().charAt(0); we can also use this method

        System.out.println("Enter your last name");
        String lastName = scan.next();

        char f = firstName.charAt(10);
        char l = lastName.charAt(5);

        String initail = f+"."+l;

        System.out.println(initail);






        /*
        Ask user to enter:
        1. First name
        2. last name
        Then print the intials
        ex: Danie
        Joness
        initial: D.J
         */
    }
}
