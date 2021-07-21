package day12_scanner;

import java.util.Scanner;

public class eligibleToBuyAlcohol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        int age = input.nextInt();
        if (age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("Get out");
        }
    }
}
