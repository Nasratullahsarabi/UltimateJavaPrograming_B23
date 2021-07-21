package day22_loopRecap;

import java.util.Scanner;

public class credential {
    public static void main(String[] args) {
        String correctUserName = "cybertek", correctPassword = "cybertek12345";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user");
        String userName = scan.next();
        System.out.println("Enter your password");
        String password= scan.next();

        if (userName.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("logged in");
        }else {
            for (int i = 0; i < 3 ; i++) {

                System.out.println("username or password is incorrect");
                System.out.println("Enter your user");
                userName = scan.next();
                System.out.println("enter password");
                password = scan.next();
                if (userName.equals(userName) && password.equals(correctPassword)){
                    System.out.println("logged in");
                    break;
                }
                if (i == 2){
                    System.out.println("your account is locked");
                    System.exit(0);
                }

            }

        }
        System.out.println("Hello Cybertek");

        scan.close();

    }
}
/*
You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the
                user to have three attempts to enter correct credentials and if all
                three attempts are failed, then print "Your account is lucked."
 */