package day19_Loops;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minN = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n<minN){     // if user entered a smaller number
                minN = n;   // we will only replace min value if the user entered number is smaller

            }
        }
        System.out.println(minN);

        scan.close();
    }
}
/*
as user to enter a number for 5 times, then return the mininum number
 */

