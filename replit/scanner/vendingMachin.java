package scanner;

import java.util.Scanner;

public class vendingMachin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a program that will determine the change given from the vending machine. The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.

  1. The given cents value should be more than 0 and less than 100. If the given cents is not in the range print "Invalid cents amount" and there should be no other output after

In valid cases print the change in this format:
Your change is x quarters, x dimes, x nickels, and x pennies

```
Enter cents:
95
Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies
         */
        System.out.println("Enter Cents");
        int cents = scan.nextInt();

        int quarter = cents/25;
        int diem = cents%25/10;
        int nickels = cents%25%10/5;
        int pennis = cents%25%10%5;
        System.out.println("quarter = " + quarter);
        System.out.println("diem = " + diem);
        System.out.println("nickels = " + nickels);
        System.out.println("pennis = " + pennis);
    }
}
