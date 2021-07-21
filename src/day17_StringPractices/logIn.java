package day17_StringPractices;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {

        String correctUserName = "Cybertek@gmail.com";
        String correctPass = "Cybertek123";

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your user name");
        String userName = scan.next();
        System.out.println("enter your password");
        String password = scan.next();

        boolean canLogIn = userName.equalsIgnoreCase(correctUserName) && password.equals(correctPass);

        if (canLogIn){
            System.out.println("logged in successfully");
        }else {
            System.out.println("invalid user name or password");
        }




        scan.close();
    }
}
/*
Ask the user to enter username and password, and username can be typed
either in lowercase or uppercase. Still, the password must be exact in
order to log in. write a program to check if the user entered username
& passwords match with the saved username & password in the database.
If it's, then print "Logged in successfully". Otherwise, print "Invalid
username or password."
        Assume that your username & password in the database are:
                                Cybertek@gmail.com
                                Cybertek123
        Ex:
            username: CYBERTEK@Gmail.com
            password: Cybertek123
            output:
                Logged in successfully
 */