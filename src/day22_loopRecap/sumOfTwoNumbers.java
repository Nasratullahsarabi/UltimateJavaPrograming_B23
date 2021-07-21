package day22_loopRecap;

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String response = "";

        do {
            System.out.println("Enter two numbers");
            int n1 = scan.nextInt(), n2 = scan.nextInt();
            System.out.println(n1+n2);
            System.out.println("Do you want to continue?");
            response = scan.next();

            while ( !(response.equals("yes") || response.equals("no"))){
                System.out.println("invalid entry, please select yes or no");
                response = scan.next();
            }
        }while (response.equals("yes"));

        System.out.println("thank you for using our calculator");

        scan.close();

        }


    }

