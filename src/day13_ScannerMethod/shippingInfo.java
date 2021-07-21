package day13_ScannerMethod;

import java.util.Scanner;

public class shippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street Address");
        String streetAdd = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your State name");
        String state = scan.next();

        System.out.println("Enter your zipcode");
        String zipCode = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        String shippingInfo = fullName+"\n"+buildingNumber+" "+streetAdd+"\n"+city+" "+state+" "+zipCode;
        System.out.println(shippingInfo);


    }
}
