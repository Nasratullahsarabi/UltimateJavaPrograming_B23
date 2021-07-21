package day17_StringPractices;

import java.util.Scanner;

public class checkAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number");
        String account = scan.next(); char firstChar = account.charAt(0);

        switch (firstChar){
            case '2':
                if (account.length() == 7){
                    System.out.println("valid account");
                }else {
                    System.out.println("invalid");
                }
                break;
            case '5':
                if (account.length()==10){
                    System.out.println("valid account");
                }else {
                    System.out.println("invalid");
                }
                break;

            default:
                System.out.println("invalid");
        }
/*
        if (account.length()==7 || account.length() == 10){
            if (account.charAt(0) == '2' && account.length() == 7){
                System.out.println("Valid Account");
            }else if (account.charAt(0)=='5' && account.length()==10){
                System.out.println("Valid Account");
            }else {
                System.out.println("Invalid Account");
            }

        }else {
            System.out.println("Invalid Account");
        }

 */


        scan.close();
    }
}
/*
Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do
    not meet the expected results print “Invalid account number”
 */