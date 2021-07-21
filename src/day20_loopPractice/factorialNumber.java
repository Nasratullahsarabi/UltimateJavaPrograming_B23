package day20_loopPractice;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1; int n = scan.nextInt();

        for (int i = n; i > 1; i--) {
            result*=i;

        }
        System.out.println("result = " + result);

        scan.close();
    }
}

/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */