package stringMethod;

import java.util.Scanner;

public class emailPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");

        String word = scan.nextLine();
        if (word.length()<6){
            System.out.println("Invalid Data");
        }else if (word.length()>=6){

        }
    }
}
/*
   Ask user to enter fullname. FirstName and lastName should be at least 6 character long.
                    If they are shorter than that print “Invalid data” and program should end.
                    If the information provided is valid, you will take the first 4 characters of
                    first string and combine them with the last three characters of the second string.
                    At the end of your combined string add “@cybertek.com” and print the final string
                    as your created email.
                    The final email should be in all lowercase.

                    input: JamesBond Secret
                    output: jameret@cybertek.com
 */