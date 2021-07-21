package day13_ScannerMethod;

import java.util.Scanner;

public class freeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of item");
        double price = scan.nextDouble();

        System.out.println("Are you a prime member?");
        boolean isPrime = scan.nextBoolean();

        double totalprice = (isPrime)? price :(price>=25)? price : price + 3.99;
        System.out.println("total price: $"+totalprice);

    }
}
