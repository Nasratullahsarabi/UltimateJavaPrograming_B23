package day19_Loops;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // whatever user enters it will be larger than this

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n > max){  // if user entered number is greater than max value
                max = n;   // then user entered number will be assigned to max variable

            }

        }
        System.out.println(max);

        scan.close();
    }
}
/*
ask user to enter a number for 5 times, then return the maximum number
 */