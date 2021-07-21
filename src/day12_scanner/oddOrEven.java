package day12_scanner;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        System.out.println(number%2==0? "even":"odd");
        System.out.println(number>0?"positive":number<0?"negative":"zero");
    }
}
