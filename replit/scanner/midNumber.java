package scanner;

import java.util.Scanner;

public class midNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();
        System.out.println("Enter your third number");
        int num3 = scan.nextInt();
        if (num1>num2&&num1<num3 || num1<num2 &&num1>num3){
            System.out.println("Medium value is "+num1);
        }else if (num2>num1&&num2<num3 || num2<num1 &&num2>num3){
            System.out.println("Medium value is "+num2);
        }else {
            System.out.println("Medim value is "+ num3);
        }
        /*
        write three numbers and write a program to read the mid number
         */
    }
}
