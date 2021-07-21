package day13_ScannerMethod;

import java.util.Scanner;

public class centsToDollar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars

2. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

3. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
         */
        System.out.println("Enter Cents");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainder = cents%100;
        if(remainder==0){
            System.out.println(cents+" is equal to "+dollars+" dollar");
        }else{
            System.out.println(cents+" cents is equal to "+ dollars+ "dollar and "+ cents);
        }
    }
}
